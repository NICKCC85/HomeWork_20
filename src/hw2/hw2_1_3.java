
package hw2;

public class hw2_1_3 {

	public static void main(String[] args) {
		// 第一題
		int y = 0;

		for (int x = 1; x <= 1000; x++) {
			if (x % 2 == 0) {
				y += x;
			}
		}
		// 第二題
		int sigma = 1; // 積分

		for (int i = 1; i <= 10; i++) {
			sigma *= i;
		}
		// 第三題
		int sigma2 = 1; // 積分
		int Multiplier = 1; // 連乘數
		while (Multiplier <= 10) {
			sigma2 *= Multiplier;
			Multiplier++;
		}
		// 第一題
		System.out.println("偶數和為" + y);
		// 第二題
		System.out.println("1~10的連乘積為" + sigma);
		// 第三題
		System.out.println("1~10的連乘積為" + sigma2);
	}
}