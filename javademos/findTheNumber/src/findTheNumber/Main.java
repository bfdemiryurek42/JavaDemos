package findTheNumber;

public class Main {

	public static void main(String[] args) {

		int[] numbers = {1,2,3,4,5,6,7,8,9,0};
		int aimedNumber = 5;
		boolean doesExist = false;
		
		for(int number:numbers) {
			if (number == aimedNumber) {
				doesExist = true;
				break;
			}
		}
		
		if (doesExist) {
			System.out.println("Number exists!");

		}else {
			System.out.println("Number does NOT exists!");

		}
	}

}
