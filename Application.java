import java.io.IOException;

/**
 * Application class instantiates and tests Dictionary class
 * @author Kirin Sharma
 * @version 1.0
 * CS 215
 * Assignment 5.1
 * 
 */

public class Application 
{

	public static void main(String[]args) throws IOException
	{
		
		Dictionary dictionary = new Dictionary();
		
		// Print all entries in the dictionary in an unknown order
		dictionary.printDictionary();
		
		// Print specific words, their definitions, and their specific hashkeys
		
		System.out.println("Word: shrift");
		System.out.println("Definition: " + dictionary.getDictionary().get("shrift"));
		System.out.println("Hashkey: " + dictionary.getDictionary().get("shrift").hashCode() + "\n");
		
		System.out.println("Word: wright");
		System.out.println("Definition: " + dictionary.getDictionary().get("wright"));
		System.out.println("Hashkey: " + dictionary.getDictionary().get("wright").hashCode() + "\n");
		
		System.out.println("Word: pelf");
		System.out.println("Definition: " + dictionary.getDictionary().get("pelf"));
		System.out.println("Hashkey: " + dictionary.getDictionary().get("pelf").hashCode() + "\n");
		
		System.out.println("Word: fell");
		System.out.println("Definition: " + dictionary.getDictionary().get("fell"));
		System.out.println("Hashkey: " + dictionary.getDictionary().get("fell").hashCode() + "\n");
		
		System.out.println("Word: quiz");
		System.out.println("Definition: " + dictionary.getDictionary().get("quiz"));
		System.out.println("Hashkey: " + dictionary.getDictionary().get("quiz").hashCode());
		
	} // end main
	
} // end class
