package hw2;

// 第四題
public class hw2_5 {
	public static void main(String[] args) {
		int count = 0;

		System.out.print("可選擇數字：");

		for (int i = 1; i <= 49; i++) {
			if (!four(i) && !four(i / 10)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\n總共 " + count + " 個。");
	}

	private static boolean four(int number) {
		while (number > 0) {
			int digit = number % 10;
			if (digit == 4) {
				return true;
			}
			number /= 10;
		}
		return false;
	}
}