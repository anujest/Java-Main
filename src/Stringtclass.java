
public class Stringtclass {
	public static void main(String[] args) {

		StringBuffer buffer = new StringBuffer("hello");
		buffer.append("java");
		System.out.println(buffer);
		StringBuilder builder = new StringBuilder("Hello");
		builder.append("Java");
		System.out.println(builder);
	}
}
