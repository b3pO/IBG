package practice;

public class Plant {
	private int height = 1;
	
	public int grow() {
		this.height++;
		return this.height;
	}
	
	public void showHeight() {
		System.out.println(this.height);
	}
}
