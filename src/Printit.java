/*
Mphephu Faresa MPHFAR001
Telephone Directory Assignement one
CSC2001F 2017
*/

import java.io.*;

public class  Printit
{

/**
*Main Binary Search Application.
*This Application reads from a queryfile containing all record information
*the queryfile has ~ separating the names from address and telephone number
*The applications splits the line on the queryfile and creates a {key:value} Record dataType with the line
*The Record dataType will be inserted inside a Binary Search Tree indivudually untill the queryfile is empty
*Finally then prints out a Binary Tree in Order
*/
   public static void main ( String [] args )
   {

	BinarySearchTree<Record> bt = new BinarySearchTree<Record> ();
	String data = "testdata";
	String line = null;

try{

	FileReader read = new FileReader (data);
	BufferedReader  bufferedReader = new BufferedReader (read);
	while((line = bufferedReader.readLine()) != null)
	{
		String [] record = line.split(" ~");
		Record entry = new Record (record[0] , line) ;
		bt.insert (entry);
	}
	bt.inOrder();





}catch(FileNotFoundException ex){
System.out.println ("File Not Found");
}catch(IOException ex)
{
ex.printStackTrace();
}}}
