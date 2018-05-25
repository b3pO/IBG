package practice;

import java.time.*;

public class App {

	public static void main(String[] args) {
		
		/*Machine mach1 = new Machine();
		Person person1 = new Person("Brandon");
		
		person1.greet();
		
		Info info1 = new Machine();
		info1.showInfo();
		
		Info info2 = person1;
		info2.showInfo();
		
		System.out.println();
		
		// Does the same as above
		outputInfo(mach1);
		outputInfo(person1);*/
		
		/*String regex = ".*[$_a-zA-Z][$_a-zA-Z0-9]*.*";
		String test = "System";
		if(test.matches(regex)) {
			System.out.println(true);
		}
		else System.out.println(false);*/
		
		Plant plant1 = new Plant();
		Tree tree1 = new Tree();
		
		int height = tree1.grow(); // tree will always be able to use parent methods
		// System.out.println(height);
		
		SimpleTimeClient time1 = new SimpleTimeClient();
		System.out.println("Current time: " + time1.toString());
		System.out.println();
		
		int hour = 10;
		int minute = 30;
		int second = 45;
		
		time1.setTime(hour, minute, second);
		time1.showTime();
		
		int day = 02;
		int month = 06;
		int year = 2018;
		
		time1.setDate(day, month, year);
		time1.showTime();
		
	};
	// Note that this method does not have to be read before main in order to be seen, as in C/C++
	private static void outputInfo(Info info) {
		info.showInfo();
	}
}
