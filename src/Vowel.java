
//Java Program to check if a vowel is present in the string?
public class Vowel {
	public static void main(String[] args) {
		String str = "I am a Estuate Employee";
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				count++;
				System.out.println(ch);
			}
		}
		System.out.println("Total number of vowels are " + count);

	}
}
