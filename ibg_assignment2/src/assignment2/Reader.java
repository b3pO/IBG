package assignment2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {


	public static void main(String[] args) throws FileNotFoundException {
		
		String fileName = "/usr/share/dict/words"; // This is the library of all the English words this system knows (linux OS)
		File textFile = new File(fileName);
		
		try (BufferedReader br = new BufferedReader(new FileReader(textFile))) { // try-with-resources will automatically close the BufferedReader when the program ends.
		
		ArrayList<String> vowels = new ArrayList<>();
		
		do {									// This is going to loop through the dictionary, and every word
			String temp = br.readLine();		// that returns true for the allVowels() method will be added to 
			if (allVowels(temp)) {				// a list that keeps a store of every word that contains all vowels
				vowels.add(temp);				// in the dictionary.
			}
		}
		while ((br.readLine()) != null);
		
		System.out.println(vowels);
		System.out.println(vowels.size());
		
		} catch (FileNotFoundException e) {
		System.out.println("File not found: " + textFile.toString());
		} catch (IOException e) {
		System.out.println("Unable to read file: " + textFile.toString());
		}
		
		Scanner input = new Scanner(textFile); 	// This marks the beginning of the second method of testing the file.
		
		ArrayList<String> vowels = new ArrayList<>();
		
		while(input.hasNextLine()) {
			
			String temp = input.nextLine();
			if (allVowels(temp)) {
				vowels.add(temp);
			}
		}
		System.out.println(vowels);  			// The reason that this list will have twice as many words in it
		System.out.println(vowels.size());		// after the program runs, is because the first method does not 
		input.close();							// keep track of duplicate words, like Ecuadorian and Ecuadorian's. 
	}											
	

public static boolean allVowels (String line) {
	
	int count = 0;

	if ((line.contains("a") || line.contains("A")) && (line.contains("e") || line.contains("E"))
			&& (line.contains("i") || line.contains("I")) && (line.contains("o") || line.contains("O"))
					&& (line.contains("u") || line.contains("U"))) {
		count = 1;
	}	
	if (count == 1) return true;
	else return false;
					
}


}
