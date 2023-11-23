package hw2;

public class hw2_7 {
	public static void main(String[] args) {
		int rows = 6;

		for (int character = 1; character < rows; character++) {
			for (int character2 = 0; character2 < character; character2++) {
				System.out.print((char) ('A' + character - 1));
			}
			System.out.println();
		}
	}
}