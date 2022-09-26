import java.util.Scanner;

//  int a=542
// 5*5*5 + 4*4*4 +2*2*2=?
public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer value");
		int num = sc.nextInt();
		int arm = 0;
		int temp = num;
		while (num != 0) {
			int r = num % 10;
			arm = arm+(r * r * r);
			num = num / 10;
		}
		System.out.println(arm);
		if (arm == temp) {
			System.out.println(temp + " is a armstrong Number");
		} else {
			System.out.println(temp + " is not a Armstrong number");
		}
	}
}
