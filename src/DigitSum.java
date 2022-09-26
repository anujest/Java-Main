
public class DigitSum {
	public static void main(String[] args) {
		int num = 3455563;
		int r;
		int sum = 0;

		while (num != 0) {
			r = num % 10;
			sum = sum + r;
			num = num / 10;
		}
		System.out.println("Sum of digits = " + sum);
	}
}
