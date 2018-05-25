package assignment1.roughdraft;

public class App2 {

	public static void main(String[] args) {
		
		String[][] rect = new String[10][30];
		String[][] letter = createLetter(rect);
		
		for(int i=0; i<letter.length; i++) {
			System.out.println();
			for(int j=0; j<letter[i].length; j++) {
				System.out.print(letter[i][j]);
			}
		}

	}
	public static String[][] createLetter(String[][] rect) {
		
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
