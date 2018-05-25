package java_tutorial1;
import practice.Fish; // imports Fish class from separate package

class Frog {
	private String name;
	private int id;
	
	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		
		return sb.toString();
		
		// Two more ways to do the same thing
		// return String.format("%2d: %s", id, name);  <--- more efficient
		// return id + ": " + name;   <--- less efficient
	}
}

public class App {

	public static void main(String[] args) {
		Frog frog1 = new Frog(5, "Freddy");
		Frog frog2 = new Frog(6, "Betty");
		
		System.out.println(frog1); // In doing this Java automatically looks for a toString method in the class
		System.out.println(frog2); // If no toString method is found, it returns the address in memory where the object resides
		
		Machine mach1 = new Machine("Fred", 10);
		mach1.showCode(); // Example to show that I can use all classes within the same package
		
		Car car1 = new Car();
		car1.showCode(); // Example of overriding parent method
		// System.out.println(car1.name);  <--- will not work because the name variable is private in the parent class
		
		Fish fish1 = new Fish(); 
		fish1.hello();
	}

}
