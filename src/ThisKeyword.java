
public class ThisKeyword {
	int a = 10;

	void run() {
		int a = 20;
		this.a = 40;
		System.out.println(a);
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		ThisKeyword th = new ThisKeyword();
		th.run();
	}
}