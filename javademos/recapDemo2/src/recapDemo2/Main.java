package recapDemo2;

public class Main {

	public static void main(String[] args) {

		double[] myList = {1.2,1.3,4.3,5.6};
		double total = 0;
		double max = myList[0];
		
		for (double item:myList) {
			if(max<item) {
				max = item;
			}
			total = total+item;
		}
		System.out.println("Total = " + total);

		System.out.println("Max number is " + max);
	}

}
