//Reverse a ArrayList
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class collections1 {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		Collections.addAll(l, 34, 56, 3, 3, 54, 32, 5, 34, 3, 455, 5, 6, 67);
		Iterator i = l.iterator();
		while (i.hasNext()) {
			System.out.print(i.next()+",");
		}
		Collections.reverse(l);
		System.out.println("\n"+l);

	}
}
