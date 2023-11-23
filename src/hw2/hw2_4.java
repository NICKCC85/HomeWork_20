package hw2;

public class hw2_4 {
	// 第四題
	public static void main(String[] args) {
		for (int multiplicand = 1; multiplicand <= 10; multiplicand++) {
			int Initial_value = (int) Math.pow(multiplicand, 2);
			System.out.print(Initial_value + " ");
		}
	}
}