package miniProjectPrimeNumber;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = -1;
		boolean isPrime = true;
		
		if (number == 1) {
			System.out.println("Number is not prime");
			return;
		}
		
		
		if (number < 1) {
			System.out.println("Invalid number");
			return;
		}
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		
		if (isPrime) {
			System.out.println("The number is prime");
		}else {
			System.out.println("The number is not prime");
		}
		
	}

}
