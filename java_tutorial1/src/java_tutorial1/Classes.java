package java_tutorial1;
import java.util.Scanner;

class Person {
	
	// Instance variables (data or "state")
	private String name;
	private int age;
	
	// setter and getter methods
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	// Classes can contain:
	// 1. Data
	// 2. Methods (subroutines)
}

public class Classes {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		String name = "Brandon";
		
		p1.setName(name);
		
		/*System.out.println(p1.name);
		 This will result in an error because the variable is private
		 */
		Scanner input = new Scanner(System.in);
		
		// String brandon = p1.getName();
		System.out.printf("Initial name is: %s%n%n", p1.getName());
		
		System.out.println("Please enter new name: ");
		String theName = input.nextLine();
		p1.setName(theName);
		System.out.println();
		
		System.out.printf("New name is:%n%s%n", p1.getName());
		
		input.close();
	}

}
