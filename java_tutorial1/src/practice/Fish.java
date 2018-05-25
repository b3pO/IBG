package practice;

public class Fish {
	
	// public String name;  <--- Bad practice
	
	// Acceptable practice -- public constants (capitalized)
	public final static int ID = 8;
	
	public void hello() {
		System.out.println("I am a fish!");
	}
}
