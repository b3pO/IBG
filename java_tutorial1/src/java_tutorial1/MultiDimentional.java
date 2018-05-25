package java_tutorial1;

public class MultiDimentional {

	public static void main(String[] args) {
		//two-dimensional array (array of arrays)
		int[][] grid = {
				{3, 56, 131},
				{2, 4},
				{1, 2, 3, 4} // the arrays don't have to be the same length
		};
		
		/*System.out.println(grid[1][1]);
		System.out.println(grid[2][0]);
		
		String[][] texts = new String[2][3];
		texts[0][1] = "Hello";
		
		System.out.println(texts[0][1]);*/
		
		for(int row=0; row<grid.length; row++) {
			for(int col=0; col<grid[row].length; col++) {
				System.out.print(grid[row][col] + "\t");
			}
			System.out.println();
		}
		
		String[][] words = new String[2][]; // allowed to leave second dimension blank
		words[0] = new String[3]; // then create each array in the second dimension manually
		words[0][1] = "hi there";
		System.out.println(words[0][1]);
	}

}
