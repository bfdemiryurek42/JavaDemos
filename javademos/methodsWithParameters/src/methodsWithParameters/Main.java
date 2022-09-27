package methodsWithParameters;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = cityName();
		System.out.println(message);
		int total = concat(5, 7);
		System.out.println(total);
		
	}
	
	public static String cityName() {
		return "Toronto";
	}
	
	public static int concat(int num1, int num2) {
		return num1+num2;
	}
	
	public static int concat2(int...numbers) {
		int total = 0;
		for (int number:numbers) {
			total += number;
		}
		return total;
	}


}
 