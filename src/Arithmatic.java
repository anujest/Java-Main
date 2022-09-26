import java.util.Scanner;

public class Arithmatic {
	int result;

	void math(int num1, int num2) {
		result = num1 + num2;
		System.out.println("Sum " + num1 + "+" + num2 + "= " + result);
		result = num1 - num2;
		System.out.println("Subtract " + num1 + "-" + num2 + "= " + result);
		result = num1 * num2;
		System.out.println("Multiply " + num1 + "*" + num2 + "= " + result);
		float result = (float) num1 / num2;
		System.out.println("Divide " + num1 + "/" + num2 + "= " + result);
	}

	void biggest(int num1, int num2) {
		if (num1 > num2)
			System.out.println("Biggest Number-> " + num1);
		else
			System.out.println("Biggest Number-> " + num2);

	}

	void evenOdd(int num1) {
		if (num1 % 2 == 0)
			System.out.println("Even Number is -> " + num1);
		else
			System.out.println("Odd number-> " + num1);
	}

	void PrimeNumber(int num1) {
		int count = 0;
		for (int i = 2; i < num1; i++) {
			if (num1 % i == 0) {
				count++;
			}
		}
		if (count >= 2) {
			System.out.println("It's a prime number " + num1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Arithmatic am = new Arithmatic();
		System.out.println("Enter two Number");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		am.math(num1, num2);
		am.biggest(num1, num2);
		am.evenOdd(num1);
		am.PrimeNumber(num1);

	}

}
