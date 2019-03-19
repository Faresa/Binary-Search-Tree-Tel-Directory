
/*
Mphephu Faresa MPHFAR001
Telephone Directory Assignement one
CSC2001F 2017
*/
import java.time.Duration;
import java.time.Instant;

import java.io.*;

public class  SearchitLinear
{
/**


*/
	public static String search (String query, String[][] entryArray) {
		String result = "Not Found" ;
		//System.out.println(query) ;

		for (int i = 0 ; i < entryArray.length-1;i++ ){
                	//System.out.println(entryArray[i][0]);
			if(entryArray[i][0]!=null){
				if (query.equals(entryArray[i][0]))
				{
					result = entryArray[i][1];
					//System.out.println(entryArray[i][1]);
					//return entryArray[i][1];
					//System.out.println(result);
				}
			}
		}
	return result;
	}

   public static void main ( String [] args )
   {
	String[][] entryArray = new String[10001][2];
        String data = "testdata"; String namesList = "experiment_queryfile" ; 
        String line = null;
	int numberOfLines =  0;
	int dataSubset = Integer.parseInt(args[0]) ;
try{

        FileReader read = new FileReader (data);
        BufferedReader  bufferedReader = new BufferedReader (read);
        int lim=0;

        while(((line = bufferedReader.readLine()) != null)&&(lim<dataSubset)) {
		String[] lineArray = line.split(" ~");
		entryArray[numberOfLines][0] =  lineArray[0] ;
		entryArray[numberOfLines][1] = line ;
		//System.out.println(entryArray[numberOfLines][0]);
		numberOfLines++;lim++;}


	FileReader readQuery = new FileReader (namesList);
        BufferedReader  bufferedReaderQ = new BufferedReader (readQuery);
	  Instant start = Instant.now();
      	while((line = bufferedReaderQ.readLine()) != null){
		//line = bufferedReaderQ.readLine();
		//System.out.println (line);
	        String result = search(line ,entryArray) ;
		System.out.println (result) ;
		}
        bufferedReaderQ.close();
	Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
       	System.out.println("\n\nSearchitLinear performance");
	System.out.println("Time taken : "+ timeElapsed.toMillis() +" milliseconds");








}catch(FileNotFoundException ex) {
System.out.println ("File Not Found");
}catch(IOException ex){
ex.printStackTrace(); }
}
}

