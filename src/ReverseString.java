//Reverse a String
public class ReverseString {
	void RevString(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			System.out.print(ch);
		}

	}
	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		String str = "I am not Normal I am crazy";
		rs.RevString(str);
	}
}
