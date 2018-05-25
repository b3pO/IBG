package java_tutorial1;

class Machine {
	private String name;
	private int code;
	
	// Below is the constructor for the class. It can be thought of as
	// a set of properties or actions that an instance of a class will take
	// automatically upon being created.
	public Machine() {
		this("Brandon", 5); // In this way I can get the simpler constructor to use the 
							// constructor with more parameters below as a default mechanism,
							// but it has to be the first line.
		
		System.out.println("Constructor running!");
		
		//name = "Brandon"; // This would be default name of any machine object created
	}
	
	// Java will determine which constructor to use based on the parameters 
	public Machine(String name) {
		this(name, 5);
		
		this.name = name;
	}
	
	public Machine(String name, int code) {
		this.name = name;
		this.code = code;
	}
	
	public void showName() {
		System.out.print(name);
		System.out.print("\t\t");
	}
	
	public void showCode() {
		System.out.print(code);
		System.out.println();
	}
}	
public class Constructors {

	public static void main(String[] args) {
		Machine machine1 = new Machine(); // Here the system prints "Constructor running" even though the object was merely instantiated
		machine1.showName();
		machine1.showCode();
		
		Machine machine2 = new Machine("Donald"); // The constructor here is chosen based on the argument provided, in this case "Donald"
		machine2.showName();
		machine2.showCode();
		
		Machine machine3 = new Machine("Matt", 2718);
		machine3.showName();
		machine3.showCode();
	}

}
