import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		double d = scan.nextDouble();
		String s = "";
		while (scan.hasNext()) {
			s = scan.nextLine();
		}
		
		scan.close();
		// Write your code here.
		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
		       
	}

//		
//		int ar[] = { 1, 2, 3, 4, 5 };
//		int big = 0;
//		int min=0;
//		for (int i = 1; i <= ar.length-1; i++) {
//			big = big + ar[i];
//		}
//		System.out.println(big);
//		for(int j=1;j<=ar.length-1;j++) {
//			min=min+ar[j];
//		}
//		System.out.println(min);

}
