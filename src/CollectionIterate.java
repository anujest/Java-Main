import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Collections;

public class CollectionIterate {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		Collections.addAll(s, 23, 4, 5, 65, 7, 87, 8, 4, 5, 3, 5, 4, 6, 90);
//	----------------------------
		System.out.println("Using forEach Method1");
		s.forEach(System.out::println);
//	----------------------------
		System.out.println("Using forEach and lambda Method2");

		s.forEach(i -> System.out.println(i));
//	----------------------------
		System.out.println("Using Iterator Method");

		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
//		--------------------------
		System.out.println("using for loop");
		for (int i : s)
			System.out.println(i);
//		--------------------------
		System.out.println("access a single element from SET");
		// to access a single element from set first need to convert it to array.
		// Set object provides a method known as toArray().
		Integer ar[] = new Integer[s.size()];
		s.toArray(ar);
		System.out.println("Element at index 2 -> "+ar[2]);
	}

}
