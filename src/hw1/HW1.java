package hw1;

public class HW1 {

	public static void main(String[] args) {
		final double PI = 3.1415; // 第四題
		// 第一題
		int number1 = 12;
		int number2 = 6;
		// 第二題
		int total = number1 + number2;
		int egg = 200;
		int pack = 12;
		int totalPack = egg / pack;
		int left = 200 % 12;
		// 第三題
		int a3 = 256559;
		int daysSecond = 86400;
		int days = a3 / daysSecond;
		int hoursSecond = a3 % daysSecond;
		int hour = hoursSecond / 3600;
		int minuteSecond = hoursSecond % 3600;
		int minute = minuteSecond / 60;
		int second = minuteSecond % 60;
		// 第五題
		int nick;
		int money = 1_500_000; // 某人有150萬
		double rate = 0.02; // 銀行利率
		double saving = money * (1 + rate); // 儲存的錢
		for (nick = 1; nick <= 10; nick++) {
			saving *= (1 + rate);
		}

		// 第一題
		System.out.println("和為:" + total);
		System.out.println("積為:" + (number1 * number2));
		// 第二題
		System.out.println("總共" + totalPack + "打" + "剩" + left + "顆");
		// 第三題
		System.out.println(days + "天");
		System.out.println(hour + "時");
		System.out.println(minute + "分");
		System.out.println(second + "秒");
		// 第四題
		double circleArea = PI * Math.pow(5, 2);
		double circumference = 2 * circleArea;
		System.out.println(circleArea);
		System.out.println(circumference);
		// 第五題
		System.out.println("共計" + (int) saving + "元");// double轉int整數
		// 第六題
		// 以int整數型別5+int整數型別5得出10
		System.out.println(5 + 5);
		// (以int整數型別5)+('5'字元Char,轉換成相應的ASCLL碼=53)得出58
		System.out.println(5 + '5');
		// 以int整數型別5+("5"為字符)串聯在一起得出55
		System.out.println(5 + "5");
	}
}