package stringsDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "Weather is so nice today";
		System.out.println(message);
		
		/*
		System.out.println("Char amount = " + message.length());
		System.out.println("5th char = " + message.charAt(4));
		System.out.println(message.concat(" Yaaay!"));
		System.out.println(message.startsWith("W"));
		System.out.println(message.endsWith("r"));
		
		char[] characters = new char[7];
		message.getChars(0, 7, characters, 0);
		System.out.println(characters);
		System.out.println(message.indexOf("e"));
		System.out.println(message.lastIndexOf("e"));
		*/
		
		String newMessage = message.replace(' ', '-');
		System.out.println(newMessage);
		System.out.println(message.substring(2,5));
		
		for(String words : message.split(" ")) {
			System.out.println(words);
		}
		
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		
		
	}
}
