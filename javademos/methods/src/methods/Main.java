package methods;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findTheNumber();
	}
	
	public static void findTheNumber() {
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
			printMessage("Number exists: " + aimedNumber);
		}else {
			System.out.println("Number does NOT exists :" + aimedNumber);

		}
	}
	
	public static void printMessage (String message) {
		System.out.println(message);

	}

}
