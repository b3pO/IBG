package java_tutorial1;

public class Car extends Machine {

	@Override   // <--- this annotation makes sure that what's below it is in fact an override method
	public void showCode() {
		System.out.println("Nope!");
	}

}
