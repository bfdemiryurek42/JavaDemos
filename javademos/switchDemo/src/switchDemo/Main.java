package switchDemo;

public class Main {

	public static void main(String[] args) {

		char grade = 'U';
		
		switch (grade) {
		case 'A': 
			System.out.println("Mukemmel, gectiniz!");
			break;
		case 'B':
			System.out.println("Cok guzel, gectiniz!");
			break;
		case 'C': 
			System.out.println("Iyi, gectiniz!");
			break;
		case 'D':
			System.out.println("Fena degil, gectiniz!");	
			break;
		case 'F':
			System.out.println("Maalesef Kaldiniz!");	
			break;
		default:
			System.out.println("Gecersiz not girdiniz");
			
		}
	}
}
