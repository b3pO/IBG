package java_tutorial1;

public class StringFormatting {

	public static void main(String[] args) {
		/* String info = "";			This is inefficient because strings are immutable in java,
										and so every info+= creates a new string with the additional bit.	
		info += "My name is Brandon";
		info += " ";
		info += "I am a programmer.";
		*/
		
		StringBuilder sb = new StringBuilder("");
		sb.append("My name is Brandon.");  // StringBuilder is appending to the original, not making copies
		sb.append(" ");
		sb.append("I am a programmer."); 
		
		System.out.println(sb.toString()); // toString method turns StringBuilder (or any other type) object back into String object
		
		StringBuilder s = new StringBuilder();
		s.append("My name is Roger.").append(" ").append("I am a diver."); // these methods can be chained together
		System.out.println(s.toString());
		
		String brandon = new String();
		brandon = "Brandon";
		System.out.printf("My name is %s.%nNew text.\n", brandon); // In Java, printf means print format, not print file
																// In string formatting %n can be used same as \n
		System.out.printf("Total cost: %10d; Quantity: %d\n", 5, 120); // %10d assigns 10 character spaces for the value, right-aligned
		System.out.printf("Total cost: %-10d; Quantity: %d\n", 5, 120); // Left-aligned
		
		for(int i=0; i<15; i++) {
			System.out.printf("%2d: a way of keeping the numbers aligned.\n", i);
		}
		
		//formatting floating point values
		System.out.printf("Total value: %.2f%n", 5.687); // Rounds to two decimal places 
		System.out.printf("Total value: %-6.1f%n", 345.56265); // Rounds to one decimal and leaves one space of padding to the right
	}

}
