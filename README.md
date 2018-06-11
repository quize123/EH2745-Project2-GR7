----------------------------------------------------------------------------------------------------------------------------------------------
This program was developed as part of KTH EH2745 course by Amar Abideen and Hatem Alatawi (Group 7)
----------------------------------------------------------------------------------------------------------------------------------------------
The program is inteded to capture set of measurements from  database localhost then preform Kmean and KNN to identify the state labels
----------------------------------------------------------------------------------------------------------------------------------------------
EH2745Project2.jar can be used to run the program
----------------------------------------------------------------------------------------------------------------------------------------------
To report any technical issues please contact aabideen@kau.edu.sa or h.s.alatawi@gmail.com
----------------------------------------------------------------------------------------------------------------------------------------------

The primary GUI application is a java class called MainGUI.java

This class includes program main graphical user interface and program excution stages which are:

1- Login to database frame and establish connection 

2- Run and execute program to create tables and figures

3- Present tables and figures 

-------------------------------------------------------------------------------------------------------------------------------------------

Secoundry classes are:

Program.py - Contains the whole Kmean and KNN analysis 

DatabaseUserChecker.java - Contain login frame and user athentication (Localhost / User: root / Password: y9mkrg6wyc8r)

ExtractDataFromCSV.java - Contains a method used to read CSV files

TablePoP.java - Contains GUI representation of Tables and figures
