package practice;

public class Machine implements Info {
	
	private int id = 7;
	
	public void start() {
		System.out.println("Machine started.");
	}

	@Override // This is from machine implementing the Info interface
	public void showInfo() {
		System.out.printf("Machine ID is: %d%n", id);
	}
}
