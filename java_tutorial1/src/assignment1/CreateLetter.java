package assignment1;

import java.util.Scanner;

public class CreateLetter {
	
	public static final int MIN_LENGTH = 10;
	public static final int MIN_WIDTH = 40;
	public static final int MAX_LENGTH = 50;
	public static final int MAX_WIDTH = 100;
	
	private int length;
	private int width;
	private String[][] grid;
	
	public CreateLetter() {
		/* If no arguments are provided, the constructor prompts the user to provide 
		 * the dimensions of the letter. The minimum and maximum values are simply
		 * a means to ensure that the dimensions are big enough to hold an address,
		 * and to ensure that the user can't enter an absurd number that won't fit 
		 * on the screen. Once the length and width are set a 2D String matrix is created
		 * using the dimensions in order to later fill that empty grid with characters.
		 */
		Scanner input = new Scanner(System.in);
		
		// This will prompt for length and width in order to create a blank letter
		System.out.println("Enter a letter length between 10 and 50: ");
		
		int line1 = input.nextInt();
		if((line1<MIN_LENGTH) || (line1>MAX_LENGTH)) {
			exit(-1);
		}
		
		System.out.println("Enter a letter width between 20 and 100: ");
		
		int line2 = input.nextInt();
		if((line2<MIN_WIDTH) || (line2>MAX_WIDTH)) {
			exit(-1);
		}
		
		if(line1>line2) {
			exit(2);
		}
		
		this.length = line1;
		this.width = line2;
		String[][] grid = new String[length][width];
		this.grid = grid;
		
		input.close();
	}
	
	public CreateLetter(int length, int width) {
		this.length = length; // If length and width are provided as arguments when the object
		this.width = width;   // is instantiated, they are simply set and the grid is created.
		String[][] grid = new String[length][width];
		this.grid = grid;
	}
	
	public void printLetter() {
		for(int i=0; i<this.grid.length; i++) {    // Method to print out what the letter looks like at any point
			System.out.println();
			for(int j=0; j<this.grid[i].length; j++) {
				System.out.print(this.grid[i][j]);
			}
		}
	}
	
	public void exit(int x) {
		// Practice with using a switch statement and exit codes (will be moving on to try/catch next)
		switch(x) {
		case 1:
			System.out.println("The letter is not big enough for this address!");
			break;
		case -1:
			System.out.println("Out of range.");
			break;
		case 2:
			System.out.println("Uhhh, that's not a rectangle.");
			break;
		}
	}
	
	public String[][] addBorders() {
		/* This method will loop through the blank grid and fill the borders
		 * with the variables set below (including the stamp).
		 */
			
		String plus = "+";
		String minus = "-";
		String line = "|";
		String hash = "#";
		String space = " ";
		
		if((this.length<MIN_LENGTH) || (this.width<MIN_WIDTH)) {
			exit(1);
		}
			
		for(int i=0; i<this.grid.length; i++) {
			System.out.println(); // Move on to the next line after every row
			for(int j=0; j<this.grid[i].length; j++) {
					
				int iOneOff = (this.grid.length)-1;
				int jOneOff = (this.grid[i].length)-1;
				int sixOff = (this.grid[i].length)-6;
					
				if(i == 0 || i == iOneOff) {
					if(j == 0 || j == jOneOff) {
						this.grid[i][j] = plus;
					}
					else this.grid[i][j] = minus;
				}
				else if((i>0) && (i<4)) {
					if(j == 0 || j == jOneOff) {
						this.grid[i][j] = line;
					}
					else if((j>sixOff) && (j<jOneOff)) {
							this.grid[i][j] = hash;
						}
					else this.grid[i][j] = space;
				}
				else {
					if(j == 0 || j == jOneOff) {
						this.grid[i][j] = line;
					}
					else this.grid[i][j] = space;
				}			
			}
		}
		return this.grid;
	}
	
	public String[][] addAddress(String name, String addr1, String addr2) {
		/* This method is intended to loop back through the grid - after having 
		 * calculated the lengths of the variables that make up the address - 
		 * and insert the name and address in the center of the envelope. It
		 * will at least print a letter repeatedly on three lines in the center
		 * (as you see from the current output), so there is a problem somewhere 
		 * in the looping construct.
		 */
		
		int length = this.grid.length;
		int width = this.grid[0].length;
		int nameLength = name.length();
		int addr1Length = addr1.length();
		int addr2Length = addr2.length();
		int maxWidth = width-4;
		char[] nameArray = name.toCharArray();
		char[] addr1Array = addr1.toCharArray();
		char[] addr2Array = addr2.toCharArray();
		// char[][] finishedLetter = new char[length][width];  <-- creating a new matrix to put the characters in one-by-one
		
		if((length<MIN_LENGTH) || (nameLength>=maxWidth) || (addr1Length>=maxWidth) || (addr2Length>=maxWidth)) {
			exit(1);
		}
		
		int midWidth = width/2;
		int midLength = length/2;
		
		for(int i=0; i<this.grid.length; i++) {
			for(int j=0; j<this.grid[i].length; j++) {
				if(i == midLength-1) {
					int inner = (midWidth-(nameLength/2))-1;
					int outer = (midWidth+(nameLength/2))+1;
					
					if((j>=inner) && (j<=outer)) {
						for(int k=0; k<nameArray.length; k++) { // I have put this loop before the if statement and achieved the same results
						
							String text = new String();
							text = String.valueOf(nameArray[k]);
						
							this.grid[i][j] = text;
						}
					}
				}
				else if(i == midLength) {
					int inner = (midWidth-(addr1Length/2))-1;
					int outer = (midWidth+(addr1Length/2))+1;
					
					for(int k=0; k<addr1Array.length; k++) {
						String text = new String();
						text = String.valueOf(addr1Array[k]);
						
						if((j>=inner) && (j<=outer))
							this.grid[i][j] = text;
					}
				}
				else if(i == midLength+1) {
					int inner = (midWidth-(addr2Length/2))-1;
					int outer = (midWidth+(addr2Length/2))+1;
					
					for(int k=0; k<addr2Array.length; k++) {
						String text = new String();
						text = String.valueOf(addr2Array[k]);
						
						if((j>=inner) && (j<=outer))
							this.grid[i][j] = text;
					}
				}
			}
		}
		return this.grid;
	}
}
