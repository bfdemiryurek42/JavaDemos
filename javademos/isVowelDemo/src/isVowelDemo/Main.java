package isVowelDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char character = 'e';
		char[] vowels = {'a','e','i','o','u'};

			switch (character) {
			case 'a':
			case 'o':
			case 'u':
				System.out.println("Thick vowels");
				break;
			case 'e':
			case 'i':
				System.out.println("Thin vowels");
				break;
			default:
				System.out.println("This is not a vowel character");
		}
		
	}

}
