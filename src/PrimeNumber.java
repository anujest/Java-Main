//Java program to check if the given number is Prime?
public class PrimeNumber {
	public static void main(String[] args) {
		int num = 50;
		int count = 0;
		for (int i = 2; i <= num; i++) {
				if (num%i == 0) {
					count++;

				}
			}
		if (count > 2) {
			System.out.println(num + " is not a prime number");
		} else {
			System.out.println(num + " is a Prime number");

		}

	}
}
