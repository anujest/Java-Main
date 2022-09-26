import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionsInterview {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(23);
		l.add(67);
		l.add(90);
		l.add(34);
		System.out.println("Element at index 2 is -> "+l.get(2));
		System.out.println("Check, is 45 available -> "+l.contains(45));
		System.out.println("Print array size -> "+l.size());
//	l.clear();
		System.out.println(l);
		Set<Integer> s = new HashSet<Integer>();
		s.add(45);
		s.add(45);
		s.add(67);
		s.add(7);
		s.add(23);
		s.add(6);
		s.add(2);
		s.add(8);
		System.out.println(s);
		Iterator<Integer> itr = s.iterator();
		while (itr.hasNext()) {
			int result = itr.next();
			System.out.print(result+",");
		}
		Integer arr[]=new Integer[s.size()];
		s.toArray(arr);
		System.out.println("\nElement at index 2 is -> "+arr[1]);
		Collections.sort(l);

	}
}