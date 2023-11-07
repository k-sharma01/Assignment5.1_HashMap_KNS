import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


/**
 * Represents a dictionary, holding key pair values of archaic words and their definitions
 * @author Kirin Sharma
 * @version 1.0
 * CS 215
 * Assignment 5.1
 * 
 */

public class Dictionary 
{
	private HashMap<String,String> dict; // a HashMap to hold the archaic words and their definitions
	
	
	/**
	 * Default constructor initializes the dictionary and reads in all of the words and their definitions
	 * from the file DictionaryWordValuePairs.csv
	 * Additionally, prints each entry
	 * @throws IOException 
	 */
	public Dictionary() throws IOException
	{
		dict = new HashMap<String,String>();
		
		BufferedReader br = new BufferedReader(new FileReader("DictionaryWordValuePairs.csv"));
		String line = "";
		String[] wordDef;
		String key;
		String value;
		
		// reads each line of csv, splits it at the comma to get the word and its definition
		while((line = br.readLine()) != null)
		{
			wordDef = line.split(",", 2);
			key = wordDef[0];
			value = wordDef[1];

			dict.put(key, value);
		} // end while
		br.close();
	} // end default constructor
	
	
	/**
	 * Getter for dict
	 * @return dict the dictionary of words and definitions
	 */
	public HashMap<String, String> getDictionary()
	{
		return dict;
	} // end getDictionary
	
	
	/**
	 * Prints all of the entries in the dictionary
	 */
	public void printDictionary()
	{
		for(String key : dict.keySet())
		{
			System.out.println("Word: " + key);
			System.out.println("Definition: " + dict.get(key) + "\n");
		}
	} // end printDictionary
	
} // end class
