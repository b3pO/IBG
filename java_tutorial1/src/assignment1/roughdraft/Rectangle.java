package assignment1.roughdraft;

public class Rectangle {
	
	private int width;
	private int height;
	private int[][] grid;
	
	public Rectangle() {
		this.width = 5;
		this.height = 3;
		this.grid = new int[width][height];
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		this.grid = new int[width][height];
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public void setWidthAndHeight(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return (this.width*this.height);
	}
	
	public String[][] createLetter(String[][] rect) {
		
		String plus = "+";
		String minus = "-";
		String line = "|";
		String hash = "#";
		String space = " ";
		
		for(int i=0; i<rect.length; i++) {
			System.out.println();
			for(int j=0; j<rect[i].length; j++) {
				
				int iOneOff = (rect.length)-1;
				int jOneOff = (rect[i].length)-1;
				int sixOff = (rect[i].length)-6;
				
				if(i == 0 || i == iOneOff) {
					if(j == 0 || j == jOneOff) {
						rect[i][j] = plus;
					}
					else rect[i][j] = minus;
				}
				else if((i>0) && (i<4)) {
					if(j == 0 || j == jOneOff) {
						rect[i][j] = line;
					}
					else if((j>sixOff) && (j<jOneOff)) {
							rect[i][j] = hash;
						}
					else rect[i][j] = space;
				}
				else {
					if(j == 0 || j == jOneOff) {
						rect[i][j] = line;
					}
					else rect[i][j] = space;
				}				
			}
		}
		return rect;
	}
}
