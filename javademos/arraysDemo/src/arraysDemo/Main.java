package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String student1 ="Bugra";
		String student2 ="Fatih";
		String student3 ="Metyu";
		String student4 ="Andac";

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		
		String[] students = new String[4];
		students[0] = "Bugra";
		students[1] = "Fatih";
		students[2] = "Andac";
		students[3] = "Metyu";

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		for(String student:students) {
			System.out.println(student);
			System.out.println("ula ula");

		}
	}

}
