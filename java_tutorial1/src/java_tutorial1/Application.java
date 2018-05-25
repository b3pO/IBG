package java_tutorial1;

class Thing {
	public final static int LUCKY_NUMBER = 7; // How to create constant variables in Java
	
	public String name;
	public static String description; // static variables belong to the class
	
	public static int count = 0;
	
	public int id; 
	
	public Thing() {
		name = "John";
		description = "Example of static methods";
		
		id = count; // Will assign an ID to each object corresponding to the number the counter was at when created
		count++; 
	}
	
	public static void showCount() {
		System.out.println(count);
	}
	
	public void showName() {
		System.out.println(name);
		System.out.println(description); // Class methods can access static variables
	
		System.out.println("Object ID: " + id);
	}
	
	public static void showInfo() { // static method
		System.out.println(description);
	}
}

public class Application {
	public static void main(String[] args) {
	
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.name = "Brandon";
		thing2.name = "Donald";
		
		Thing.showInfo(); // This method is static and hence must be called by the class itself
		thing1.showName();
		
		System.out.println(Thing.LUCKY_NUMBER); // Example of constant
		
		Thing.showCount(); // Keeps count of how many objects of this class have been created
		thing2.showName();
	}
}
