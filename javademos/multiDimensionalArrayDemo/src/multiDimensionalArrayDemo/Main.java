package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] cities = new String[3][3];
		
		cities[0][0] = "Toronto";
		cities[0][1] = "Missisauga";
		cities[0][2] = "Scarborough";
		cities[1][0] = "Markham";
		cities[1][1] = "Vaughan";
		cities[1][2] = "Barrie";
		cities[2][0] = "Oshawa";
		cities[2][1] = "Orillia";
		cities[2][2] = "Newmarket";

		for (int i = 0; i < cities.length; i++) {
			System.out.println("-------------------");
			for (int j = 0; j < cities.length; j++) {
				System.out.println(cities[i][j]);
			}
		}
		
	}

}
