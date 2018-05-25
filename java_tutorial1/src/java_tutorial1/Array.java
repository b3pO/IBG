package java_tutorial1;

public class Array {
	public static void main(String[] args) {
		
		// this is a value
		int value = 7;
		
		// this is a reference
		int[] values;
		
		// allocates enough memory to store 3 integers
		values = new int[3];
		
		// once default array has been allocated java puts a default value of 0 for every space allocated
		System.out.println(values[0]);
		
		values[0] = 10;
		values[1] = 20; 
		values[2] = 30;
		
		// all arrays have .length method that returns length
		for(int i=0; i<values.length; i++)
			System.out.println(values[i]);
		
		// arrays can also be initialized all at once
		int[] numbers = {5,6,7};
		
		// same principle for strings 
		String[] words = {"red", "green", "blue"};

		String red = words[0] + " " + values[0];
		String green = words[1] + " " + values[1];
		String blue = words[2] + " " + values[2];
		
		String[] colors = {red, green, blue};
		
		// you can concatonate integers and strings 
		for(int i=0; i<colors.length; i++) {
			System.out.println(colors[i]);
		}
		
		// another way to iterate through arrays of strings
		for(String word: words) {
			System.out.println(word);
		}
		
		// defaults values in the array as null references
		String[] texts = new String[2];
		// prints null
		System.out.println(texts[0]);
	}
}
