import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2Heighest {
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		Collections.addAll(ar, 2, 45, 2, 6, 856, 66, 5, 3, 5, 7, 33);
		Collections.sort(ar);
		System.out.println(ar);
		for (int i : ar)
			System.out.print(i + ", ");
		System.out.println("\n2nd heighest element is " + ar.get(ar.size() - 2));
	}
}
