package practice;

public class App2 {

	public static void main(String[] args) {
		
		byte byteValue = 75; // 8 bits
		short shortValue = 125; // 16 bits
		int intValue = 2000; // 32 bits
		long longValue = 234552314; // 64 bits
		
		float floatValue = 4242.30f;
		double doubleValue = 245.31343;
		
		System.out.println(Double.MAX_VALUE); // primitive way to see maximum values of floating point types
		
		byteValue = (byte)130;
		System.out.println(byteValue);
		
		intValue = (int)byteValue;
		System.out.println(intValue);
		
		

	}

}
