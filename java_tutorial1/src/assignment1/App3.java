package assignment1;

public class App3 {
	
	public static final int MIN_LENGTH = 10;
	public static final int MIN_WIDTH = 40;
	public static final int MAX_LENGTH = 50;
	public static final int MAX_WIDTH = 100;

	public static void main(String[] args) {
		
		// With no arguments the console will prompt you for the dimensions
		// CreateLetter letter = new CreateLetter();
		
		CreateLetter letter = new CreateLetter(15, 60);
		
		letter.addBorders();
		letter.printLetter();
		
		String name = "Brandon Gay";
		String addr1 = "1234 Rennaissance Dr";
		String addr2 = "Charlotte, NC 28217";
		
		letter.addAddress(name, addr1, addr2);
		letter.printLetter();

	}
}	
