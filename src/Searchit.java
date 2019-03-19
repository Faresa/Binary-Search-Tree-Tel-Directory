/*
Mphephu Faresa MPHFAR001
Telephone Directory Assignement one
CSC2001F 2017
*/

import java.io.*;
import java.time.Duration;
import java.time.Instant;



public class  Searchit
{
/**
*Search Binary Tree for record.
*this Method takes query  and binary tree as a parameters
*@param query	 the query to search for in the Tree.
*@param tree  	 BinarySearchTree<Record> which uses dataTpe Record which contains {key:value} pair
*
*/
	public static Record search(String query , BinarySearchTree<Record> tree) {
		Record entry = new Record (query,"");
		Record notFound = new Record ("Record","Not Found") ;

		if (tree.find(entry) == null) {
			return notFound;
		}
		else if (query.equals(tree.find(entry).data.key)) {
			return tree.find(entry).data; }

		else{
		 	return notFound; }

	}


/**
*Main Searchit Application.
*Runs a BinarySearch for n number of names from a nameslist
*int dataSubset = n ;  controls the number of nodes in a tree , Used for search performance experimentations
*
*/
  public static void main (  String [] args )
   {

	BinarySearchTree<Record> bt = new BinarySearchTree<Record> ();
        String data = "testdata";
	String namesList = "experiment_queryfile" ;
        int  dataSubset = Integer.parseInt(args[0]);
	String line = null;

try{

        FileReader read = new FileReader (data);
        BufferedReader  bufferedReader = new BufferedReader (read);
        int lim=0;
	while(((line = bufferedReader.readLine()) != null)&&(lim<dataSubset)){
		String[] record = line.split(" ~");
		Record entry = new Record (record[0],line ) ;
		bt.insert (entry);
		lim++;
	}
		bufferedReader.close();



	FileReader readQuery = new FileReader (namesList);
        BufferedReader  bufferedReaderQ = new BufferedReader (readQuery);
	Instant start = Instant.now();

	while((line = bufferedReaderQ.readLine()) != null) {

		Record node = search(line,bt);
		if (node!=null) {
              	System.out.println(node) ; }
		else {System.out.println("Not Found");}
	}
		bufferedReaderQ.close();
		Instant end = Instant.now();
	        Duration timeElapsed = Duration.between(start, end);
        	System.out.println("\n\nSearchit Binary Performance");
		System.out.println("Time taken : "+ timeElapsed.toMillis() +" milliseconds");








}catch(FileNotFoundException ex) {
System.out.println ("File Not Found");
}catch(IOException ex){
ex.printStackTrace(); }}}


