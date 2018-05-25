package java_tutorial1;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// will loop infinitely
		while(true) {
	
			System.out.println("Enter a command: ");
			
			String line = input.nextLine();
			
			// most switch statements will use either a string or an integer as an argument
			switch(line) {
			case "start":
				System.out.println("Machine started");
				break;
			case "stop":
				System.out.println("Machine stopped");
				break;
				
			default:
				System.out.println("Command not recognized");
			}
		}

	}

}
