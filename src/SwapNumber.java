//Swap two number without using third variable
public class SwapNumber {
	public static void main(String[] args) {
		System.out.println("----------1st Way--------");
		int num1 = 45;
		int num2 = 67;
		num2 = num1 + num2;
		num1 = num2 - num1;
		num2 = num2 - num1;
		System.out.println("num1= " + num1);
		System.out.println("num2= " + num2);

//BY 2nd Method
		System.out.println("---------2nd Way----------");
		int a = 40;
		int b = 30;
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("a= " + a);
		System.out.println("b= " + b);

//by using third variable
		System.out.println("---------Using third Variable--------");
		int x = 33;
		int y = 44;
		int z;
		z = y;
		y = x;
		x = z;
		System.out.println("x= " + x);
		System.out.println("y= " + y);

	}
}
