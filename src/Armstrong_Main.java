import java.util.Scanner;

public class Armstrong_Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a Integer value");
		int num = sc.nextInt();

		int temp, r;
		double result = 0;
		int count=0;
		temp = num;
		int c=num;
		
		while(c!=0) {
			c=c/10;
			count++;
		}
		while (temp != 0) {
			r = temp % 10;
			result = result + Math.pow(r, count);
			temp /= 10;
		}
		if (result == num)
			System.out.println(num + " is an Armstrong number.");
		else
			System.err.println(num + " is not an Armstrong number.");
	}
}


