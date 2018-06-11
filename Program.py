
# coding: utf-8

# In[53]:

print("Program is executing 0% ...... DO NOT CLOSE THE WINDOW")
import numpy as np
import matplotlib.pyplot as plt
import matplotlib.patches as mpatches
from collections import Counter
import pymysql
from scipy.spatial import distance_matrix as DisMatrix
dataAvG=np.zeros((200,2))
import warnings
warnings.filterwarnings("ignore")
TIMEDATA = np.zeros(200)

def KNearestNeighbors(data, predict, k):
    distances = []
    for group in data:
        for features in data[group]:
            euclidean_distance = np.linalg.norm(np.array(features) - np.array(predict))
            distances.append([euclidean_distance, group])
    votes = [i[1] for i in sorted(distances)[:k]]
    vote_result = Counter(votes).most_common(1)[0][0]
    return vote_result


def sqlc():
    localhost = '127.0.0.1'
    name = 'root'
    passwor = 'y9mkrg6wyc8r'
    tablename = 'subtables'
    db = pymysql.connect(localhost, name, passwor, tablename)
    return db


def read(x, y, z, r):
    db = sqlc()
    cursor = db.cursor()
    data = []
    for t in range(1, r):
        sql = "SELECT value FROM {} WHERE (name='{}' OR name='{}') AND time = {}".format(x, y, z, t)
        cursor.execute(sql)
        point = []
        for row in cursor.fetchall():
            point.append(row[0])
            # print(row)
        # print(point)
        data.append(point)
        dataset = data
    #print(data)
    return dataset
 
def readtimeSQL():
    db = sqlc()
    cursor = db.cursor()
    data = []
    for t in range(1, 201):
        sql = "SELECT time FROM `subtables`.`measurements`;"
        cursor.execute(sql)
        point = []
        for row in cursor.fetchall():
            point.append(row[0])
            # print(row)
        # print(point)
        data.append(point)
    
    return data



def kMeans(X, K, busa, busv, p1, p2, p3):    
    ONE = X.shape[0]
    TWO = X.shape[1]
    
    iniCentroids = [84,164,85,143]

    # print(iniCentroids)
    centroids = X[iniCentroids]
   
    OldCentroids = np.zeros((K, TWO))
    ClusterAssi = np.zeros(ONE)
    

    while (OldCentroids != centroids).any():
        OldCentroids = centroids.copy()
        
        DistanceMatrix = DisMatrix(X, centroids, p=2)
        
        
        for i in np.arange(ONE):
            d = DistanceMatrix[i]
            closeCentriod = (np.where(d == np.min(d)))[0][0]
            ClusterAssi[i] = closeCentriod
               
                
        #print(CLAR_ClusterAssi)

            for k in np.arange(K):
                  Xk = X[ClusterAssi == k]
                  centroids[k] = np.apply_along_axis(np.mean, axis=0, arr=Xk)

    colors1 = []

    for i in range(len(centroids)):
        colors1.append([])
        if p1 < centroids[i][1] < p2:
            colors1[i] = "Generator down"
        elif centroids[i][1] < p1:
            colors1[i] = "High Load"
        elif p3 < centroids[i][1]:
            colors1[i] = "Low Load"
        elif p2 < centroids[i][1] < p3:
            colors1[i] = "Line Down"
    colors2 = []
    for i in range(len(centroids)):
        colors2.append([])
        if centroids[i][1] < p1:
            colors2[i] = 'green'
        elif p1 < centroids[i][1] < p2:
            colors2[i] = 'red'
        elif p2 < centroids[i][1] < p3:
            colors2[i] = 'blue'
        elif p3 < centroids[i][1]:
            colors2[i] = 'yellow'
    p1 = 0
    p2 = 0
    p3 = 0

    ff = lambda x: colors1[int(x)]
    labelsoriginal = (ClusterAssi).tolist()
    
    labelsscluster = np.array(labelsoriginal, dtype=int)
    labelsknn = list(map(ff, labelsoriginal))
    labelsknn = np.array(labelsknn)
    #print(Counter(labelsscluster));

        
    
    
    
    ZZ = np.column_stack((X, labelsscluster))
    XX = ZZ.tolist()
    
    data2CSV = np.column_stack((TIMEDATA, X))
    data2CSV = np.column_stack((data2CSV, labelsknn))
    
    form = "src/tables/{}.csv".format(busv)
    np.savetxt(form, data2CSV, delimiter=",", fmt='%s', header="Time, Volt(pu),Ang(Deg),Status", comments='')

    with plt.style.context('seaborn-whitegrid'):
        plt.figure(figsize=(8, 6))

    # colorss = ['r', 'g', 'y', 'b']
    f = lambda x: colors2[int(x)]
    labels = list(map(f, labelsoriginal))
    plt.scatter(X[:, 1], X[:, 0], color=labels, s=5)
    plt.scatter(centroids[:, 1], centroids[:, 0], marker="x", color='black')

    red_patch = mpatches.Patch(color='red', label='Generator down')
    blue_patch = mpatches.Patch(color='blue', label='Line Down')
    green_patch = mpatches.Patch(color='green', label='High Load')
    yellow_patch = mpatches.Patch(color='yellow', label='Low Load')

    plt.legend(handles=[red_patch, blue_patch, green_patch, yellow_patch])
    plt.ylabel(busv)
    plt.xlabel(busa)
    plt.tight_layout()
    
    #plt.show
    form = "src/img/{}.png".format(busa)
    
    plt.savefig(form)
    return XX, colors1


def kMeans2(K, p1, p2, p3):
    # Obtain the values from the database
    Xm = read("measurements", y="CLAR_ANG" ,z="CLAR_VOLT" , r=201) #0
    Xy = read("measurements", y="AMHE_ANG", z="AMHE_VOLT", r=201) #1
    XTOT= np.column_stack((Xm,Xy))
    Xy = read("measurements", y="WINL_ANG", z="WINL_VOLT", r=201) #2
    XTOT= np.column_stack((XTOT,Xy))
    Xy = read("measurements", y="BOWM_ANG", z="BOWM_VOLT", r=201) #3
    XTOT= np.column_stack((XTOT,Xy))
    Xy = read("measurements", y="TROY_ANG", z="TROY_VOLT", r=201) #4
    XTOT= np.column_stack((XTOT,Xy))
    Xy = read("measurements", y="MAPL_ANG", z="MAPL_VOLT", r=201) #5
    XTOT= np.column_stack((XTOT,Xy))
    Xy = read("measurements", y="GRAN_ANG", z="GRAN_VOLT", r=201) #6
    XTOT= np.column_stack((XTOT,Xy))
    Xy = read("measurements", y="WAUT_ANG", z="WAUT_VOLT", r=201) #7
    XTOT= np.column_stack((XTOT,Xy))
    Xy = read("measurements", y="CROSS_ANG",z="CROSS_VOLT", r=201) #8
    XTOT= np.column_stack((XTOT,Xy))
    
   
    AVGTOT=np.zeros((200,2))
    AVG_GENIND = np.zeros(200)
    
    # Calculate the average voltage and angel of system buses
    for i in range(200):
           AVGTOT [i][0]=  (XTOT [i][0]+ XTOT [i][2]+ XTOT [i][4]+ XTOT [i][6]+ XTOT [i][8]+ XTOT [i][10]+ XTOT [i][12]+ XTOT [i][14]+ XTOT [i][16])/9
           AVGTOT [i][1]=  (XTOT [i][1]+ XTOT [i][3]+ XTOT [i][5]+ XTOT [i][7]+ XTOT [i][9]+ XTOT [i][11]+ XTOT [i][13]+ XTOT [i][15]+ XTOT [i][17])/9
           AVG_GENIND[i]= (abs(XTOT[i][0]-XTOT [i][6]) + abs(XTOT [i][2]-XTOT [i][10])  + abs(XTOT [i][4]-  XTOT [i][14]))/3
           
    DATA = AVGTOT 

    
    
    ONE = DATA.shape[0]
    TWO = DATA.shape[1]


    iniCentroids = [84,164,85,143]

    # print(iniCentroids)
    centroids = DATA[iniCentroids]
   
    OldCentroids = np.zeros((K, TWO))
    ClusterAssi = np.zeros(ONE)
    

    while (OldCentroids != centroids).any():
        OldCentroids = centroids.copy()
        
        DistanceMatrix = DisMatrix(DATA, centroids, p=2)
        
    # Distance from centroids    
        for i in np.arange(ONE):
            d = DistanceMatrix[i]

            closeCentriod = (np.where(d == np.min(d)))[0][0]
            
            ClusterAssi[i] = closeCentriod
                
            for k in np.arange(K):
                  Xk = DATA[ClusterAssi == k]
                  centroids[k] = np.apply_along_axis(np.mean, axis=0, arr=Xk)
    
#Labeling
    
    labelsoriginal = (ClusterAssi).tolist()
    labelsscluster = np.array(labelsoriginal, dtype=int)
    unique, counts = np.unique(labelsscluster, return_counts=True)
    
    ClusterFreq= np.asarray((unique, counts)).T
    
    N=[ClusterFreq[0][0],ClusterFreq[1][0],ClusterFreq[2][0],ClusterFreq[3][0]]
    M=[ClusterFreq[0][1],ClusterFreq[1][1],ClusterFreq[2][1],ClusterFreq[3][1]]
    

    

    ZZ = np.column_stack((DATA, labelsscluster))
    XX = ZZ.tolist()
    
    XN1=np.zeros((M[0],2))
    XN2=np.zeros((M[1],2))
    XN3=np.zeros((M[2],2))
    XN4=np.zeros((M[3],2))
    

    M1_GENIND=np.zeros(M[0])
    M2_GENIND=np.zeros(M[1])
    M3_GENIND=np.zeros(M[2])
    M4_GENIND=np.zeros(M[3])
    
    
    M1=0
    M2=0
    M3=0
    M4=0
    
    for i in range(200):
           if XX[i][2] == N[0]:
               
               XN1[M1][0]= XX[i][0]
               XN1[M1][1]= XX[i][1]
               M1_GENIND[M1]= AVG_GENIND[i]
               M1=M1+1
               
           if XX[i][2] == N[1]:
               
               XN2[M2][0]= XX[i][0]
               XN2[M2][1]= XX[i][1]
               M2_GENIND[M2]= AVG_GENIND[i]
               M2=M2+1
               
           if XX[i][2] == N[2]:
               
               XN3[M3][0]= XX[i][0]
               XN3[M3][1]= XX[i][1]
               M3_GENIND[M3]= AVG_GENIND[i]
               M3=M3+1
               
           if XX[i][2] == N[3]:
               XN4[M4][0]= XX[i][0]
               XN4[M4][1]= XX[i][1]
               M4_GENIND[M4]= AVG_GENIND[i]
               M4=M4+1       


    XXmean = [np.mean(XN1, axis=0),np.mean(XN2, axis=0),np.mean(XN3, axis=0),np.mean(XN4, axis=0)]
    GENInd= [np.mean(M1_GENIND, axis=0),np.mean(M2_GENIND, axis=0),np.mean(M3_GENIND, axis=0),np.mean(M4_GENIND, axis=0)]
    LoadInd= [XXmean[0][0],XXmean[1][0],XXmean[2][0],XXmean[3][0]]
   
    StateLabel =["","","",""]


    HighstLoadIndex=LoadInd.index(min(LoadInd))
    LowestLoadIndex=LoadInd.index(max(LoadInd))
    GenIndIndex = GENInd.index(min(GENInd))
    GENInd[HighstLoadIndex] = 0
    GENInd[LowestLoadIndex] = 0
    GENInd[LowestLoadIndex] = 0
    LineINDIndex=GENInd.index(max(GENInd)) #Remaining Unlabeled
    StateLabel[LineINDIndex] = "Line Down"
    StateLabel[HighstLoadIndex] = "High Load" 
    StateLabel[LowestLoadIndex] = "Low Load" 
    StateLabel[GenIndIndex] = "Generator Down" 

    
    colors1 = []
    
    #for i in range(len(labelsscluster)):
    

    for i in range(len(centroids)):
        colors1.append([])
        if p1 < centroids[i][1] < p2:
            colors1[i] = StateLabel[GenIndIndex]
        elif centroids[i][1] < p1:
            colors1[i] = StateLabel[HighstLoadIndex] 
        elif p3 < centroids[i][1]:
            colors1[i] = StateLabel[LowestLoadIndex]
        elif p2 < centroids[i][1] < p3:
            colors1[i] = StateLabel[LineINDIndex]
   
    colors2 = []
    for i in range(len(centroids)):
        colors2.append([])
        if centroids[i][1] < p1:
            colors2[i] = 'green'
        elif p1 < centroids[i][1] < p2:
            colors2[i] = 'red'
        elif p2 < centroids[i][1] < p3:
            colors2[i] = 'blue'
        elif p3 < centroids[i][1]:
            colors2[i] = 'yellow'
            
    data2CSV = np.column_stack((StateLabel, M))
    data2CSV = np.column_stack((data2CSV, XXmean))
    form = "src/tables/{}.csv".format("System")
    np.savetxt(form, data2CSV, delimiter=",", fmt='%s', header="Status,Size,Volt(pu),Ang(Deg)", comments='')
    
    ff = lambda x: colors1[int(x)]
    labelsknn = list(map(ff, labelsoriginal))
    labelsknn = np.array(labelsknn)
    
    data2CSV= np.column_stack((TIMEDATA,DATA))
    data2CSV= np.column_stack((data2CSV,labelsknn))
    data2CSV= np.column_stack((data2CSV,XTOT))
    form = "src/tables/{}.csv".format("SystemOverAll")
    np.savetxt(form, data2CSV, delimiter=",", fmt='%s', header="Time,Uavg(pu),Ang(Deg),Status,U1,Ang1(Deg),U2,Ang2(Deg),U3,Ang3(Deg),U4,Ang4(Deg),U5,Ang5(Deg),U6,Ang6(Deg),U7,Ang7(Deg),U8,Ang8(Deg),U9,Ang9(Deg)", comments='')

    with plt.style.context('seaborn-whitegrid'):
        plt.figure(figsize=(8, 6))

    # colorss = ['r', 'g', 'y', 'b']
    f = lambda x: colors2[int(x)]
    labels = list(map(f, labelsoriginal))
    plt.scatter(DATA[:, 1], DATA[:, 0], color=labels, s=5)
    plt.scatter(centroids[:, 1], centroids[:, 0], marker="x", color='black')

    red_patch = mpatches.Patch(color='red', label='Generator down')
    blue_patch = mpatches.Patch(color='blue', label='Line Down')
    green_patch = mpatches.Patch(color='green', label='High Load')
    yellow_patch = mpatches.Patch(color='yellow', label='Low Load')

    plt.legend(handles=[red_patch, blue_patch, green_patch, yellow_patch])
    plt.ylabel("U(p.u)")
    plt.xlabel("Angle(Degree)")
    plt.tight_layout()
    
    #plt.show
    form = "src/img/{}.png".format("System")
    plt.savefig(form)
    return XX, colors1

def call(busa, busv, p1, p2, p3):
    name1 = "measurements"
    name2 = "analog_values"
    results1 = read(x=name1, y=busa, z=busv, r=201)
    
    X = np.array(results1)
    
    results2 = read(x=name2, y=busa, z=busv, r=21)
    K = 4
    XX, c1 = kMeans(X, K, busa, busv, p1, p2, p3)
    data(XX, results2, c1, busa)
    
    

def callS(SLACKBUS):
    data2CSV = read("measurements", y="CLAR_ANG" ,z="CLAR_VOLT" , r=201)
    data2CSV = data2CSV = np.column_stack((TIMEDATA, data2CSV))
    form = "src/tables/{}.csv".format(SLACKBUS)
    np.savetxt(form, data2CSV, delimiter=",", fmt='%s', header="Time,Volt(pu),Ang(Deg)", comments='')
    
    with plt.style.context('seaborn-whitegrid'):
        plt.figure(figsize=(8, 6))


    red_patch = mpatches.Patch(color='red', label='Generator down')
    blue_patch = mpatches.Patch(color='blue', label='Line Down')
    green_patch = mpatches.Patch(color='green', label='High Load')
    yellow_patch = mpatches.Patch(color='yellow', label='Low Load')

    plt.legend(handles=[red_patch, blue_patch, green_patch, yellow_patch])
    plt.ylabel("CLAR_VOLT")
    plt.xlabel("CLAR_ANG")
    plt.tight_layout()
    
    #plt.show
    form = "src/img/{}.png".format(SLACKBUS)
    
    plt.savefig(form)

def data(XX, results2, c1, busa):
    
    Train = {0: [], 1: [], 2: [], 3: []}
    for i in XX:
        Train[i[-1]].append(i[:-1])
    kL = [10, 20, 30, 40]
    for k in kL:
        dataset = []
        for i in results2:
            vote = KNearestNeighbors(Train, i, k)
            dataset.append(vote)
        #print(dataset)
        f = lambda x: c1[int(x)]
        labels = list(map(f, dataset))
        labels = np.array(labels)
        dataset = np.array(dataset)
        ZZ = np.column_stack((dataset, labels))
        #print(ZZ)
        form = "src/tables/{}{}.csv".format(busa, k)
        np.savetxt(form, ZZ, delimiter=",", fmt='%s', header="Cluster,Status", comments='')
        

def  kMeansData() :
    
    Xm = read("analog_values", y="CLAR_ANG" ,z="CLAR_VOLT" , r=21) #0
    Xy = read("analog_values", y="AMHE_ANG", z="AMHE_VOLT", r=21) #1
    XTOT= np.column_stack((Xm,Xy))
    Xy = read("analog_values", y="WINL_ANG", z="WINL_VOLT", r=21) #2
    XTOT= np.column_stack((XTOT,Xy))
    Xy = read("analog_values", y="BOWM_ANG", z="BOWM_VOLT", r=21) #3
    XTOT= np.column_stack((XTOT,Xy))
    Xy = read("analog_values", y="TROY_ANG", z="TROY_VOLT", r=21) #4
    XTOT= np.column_stack((XTOT,Xy))
    Xy = read("analog_values", y="MAPL_ANG", z="MAPL_VOLT", r=21) #5
    XTOT= np.column_stack((XTOT,Xy))
    Xy = read("analog_values", y="GRAN_ANG", z="GRAN_VOLT", r=21) #6
    XTOT= np.column_stack((XTOT,Xy))
    Xy = read("analog_values", y="WAUT_ANG", z="WAUT_VOLT", r=21) #7
    XTOT= np.column_stack((XTOT,Xy))
    Xy = read("analog_values", y="CROSS_ANG",z="CROSS_VOLT", r=21) #8
    XTOT= np.column_stack((XTOT,Xy))
    
    AVGTOT=np.zeros((20,2))

    
    for i in range(20):
           AVGTOT [i][0]=  (XTOT [i][0]+ XTOT [i][2]+ XTOT [i][4]+ XTOT [i][6]+ XTOT [i][8]+ XTOT [i][10]+ XTOT [i][12]+ XTOT [i][14]+ XTOT [i][16])/9
           AVGTOT [i][1]=  (XTOT [i][1]+ XTOT [i][3]+ XTOT [i][5]+ XTOT [i][7]+ XTOT [i][9]+ XTOT [i][11]+ XTOT [i][13]+ XTOT [i][15]+ XTOT [i][17])/9
    results2 = AVGTOT 

    p1= -15
    p2= 0  
    p3= 10
    K = 4
    XX1, c12 = kMeans2(K, p1, p2, p3)
    data(XX1, results2, c12, "System")
    

TIME=readtimeSQL()[0];
u, indices = np.unique(TIME, return_index=True)
indices.sort()

for i in range (len(TIMEDATA)):
    TIMEDATA[i]=TIME[indices[i]]

call("CROSS_ANG", "CROSS_VOLT", -10.5, -8, 6.5)
print("Program is executing 10% ...... DO NOT CLOSE THE WINDOW")
callS("CLAR_VOLT")
print("Program is executing 20% ...... DO NOT CLOSE THE WINDOW")
call("AMHE_ANG","AMHE_VOLT",-10.5,10,22)
print("Program is executing 30% ...... DO NOT CLOSE THE WINDOW")
call("BOWM_ANG","BOWM_VOLT",-10.5,-4.5,0)
print("Program is executing 40% ...... DO NOT CLOSE THE WINDOW")
call("GRAN_ANG","GRAN_VOLT",-20,0,15)
print("Program is executing 50% ...... DO NOT CLOSE THE WINDOW")
call("MAPL_ANG","MAPL_VOLT",-20,0,12)
print("Program is executing 60% ...... DO NOT CLOSE THE WINDOW")
call("TROY_ANG","TROY_VOLT",-20,-9,0)
print("Program is executing 70% ...... DO NOT CLOSE THE WINDOW")
call("WAUT_ANG", "WAUT_VOLT", -20, 0, 17)
print("Program is executing 80% ...... DO NOT CLOSE THE WINDOW")
call("WINL_ANG","WINL_VOLT",-20,0,20)
print("Program is executing 90% ...... DO NOT CLOSE THE WINDOW")
kMeansData()
print("Program is executing 100% ...... DO NOT CLOSE THE WINDOW")
print("Program is closing .....................................")




