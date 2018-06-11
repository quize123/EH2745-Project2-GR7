


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExtractDataFromCSV {
	

	
public String[][] ExtractTable(String fileName) throws IOException{
	
       List<List<String>> list = new ArrayList<List<String>>();
       BufferedReader br = new BufferedReader(new FileReader(fileName));
       String line = br.readLine();
       String[] headers = line.split(",");
       
       
       for(String header: headers) {
           List<String> subList = new ArrayList<String>();
           subList.add(header);
           list.add(subList);
       }
       
       while((line = br.readLine()) != null) {
           String[] elems = line.split(",");
           for(int i = 0; i < elems.length; i++) {
               list.get(i).add(elems[i]);
           }
       }
       br.close();
       
       int rows = list.size();
       int cols = list.get(0).size();

      
       
       String[][] TempArray2D = new String[rows][cols];
       
       for(int row = 0; row < rows; row++) {
           for(int col = 0; col < cols; col++) {
               TempArray2D[row][col] = list.get(row).get(col);

           }
       }
       
       String[][] Array2D = new String[cols-1][rows];

       for(int i = 0; i < rows; i++) {
    	   for(int j = 0; j < cols-1; j++) {
  
    		   Array2D[j][i] = TempArray2D[i][j+1];
    	   }
    	 }
       
return Array2D ;

}
}



