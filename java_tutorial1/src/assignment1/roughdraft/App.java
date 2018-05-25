package assignment1.roughdraft;

public class App {

	public static void main(String[] args) {
		
		int[][] zeroes = new int[20][100];
		
		for(int i=0; i<zeroes.length; i++) {
			System.out.println();
			for(int j=0; j<zeroes[i].length; j++) {
				zeroes[i][j] = j;
				// System.out.print(j + " ");  <-- was initially using this to create a grid
			}
		}
		System.out.println(zeroes.length);
		for(int i=0; i<zeroes.length; i++) {
			System.out.println();
			for(int j=0; j<zeroes[i].length; j++) {
				
				if(i == 0 || i == 19) {
					if(j == 0 || j == 99) {
						System.out.print("+");
					}
					else System.out.print("-");
				}
				else if((i>0) && (i<4)) {
					if(j == 0 || j == 99) {
						System.out.print("|");
					}
					else if((j>94) && (j<99)) {
							System.out.print("#");
						}
					else System.out.print(" ");
				}
				else if((i>3) && (i<14)) {
					if(j == 0 || j == 99) {
						System.out.print("|");
					}
					else System.out.print(" ");
				}
				else if(i == 14) {
					System.out.print("|                                                                Brandon Gay                       ");
				}
				else if(i == 15) {
					System.out.print("|                                                                1234 Rennaissance Drive           ");
				}
				else if(i == 16) {
					System.out.print("|                                                                Charlotte, NC 28217               ");
				}
				else {
					if(j == 0 || j == 99) {
						System.out.print("|");
					}
					else System.out.print(" ");
				}		
			}
		}
	}

	public static void printLine(String x) {
		switch(x) {
		case "name":
			System.out.print("|                                                                Brandon Gay                       ");
			break;
		case "address1":
			System.out.print("|                                                                1234 Rennaissance Drive           ");
			break;
		case "address2":
			System.out.print("|                                                                Charlotte, NC 28217               ");
			break;
		default:
			System.out.print("|                                                                                                  ");
		}
		
	}
	}


