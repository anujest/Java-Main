
public class excepctionHandling {

	public static void main(String[] args) {
		int a = 18;
		int result;
		try {
			result = a / 0;
			System.out.println(result);

		}
//		catch (ArithmeticException e) {
//			System.out.println(e);
//		}
		finally {
			System.out.println("Arithmetic Acception occured");
		}

	}
}
