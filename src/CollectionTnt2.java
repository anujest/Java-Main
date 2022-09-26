import java.util.*;

public class CollectionTnt2 {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet();
		Collections.addAll(hs, 45, 5, 332, 8, 5, 3, 343, 26, 8, 227, 9, 335, 90);
		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------------------");
		for (int i : hs)
			System.out.println(i);
		System.out.println("------------------------");
		System.out.println(hs.size());
		System.out.println("-----TreeSet-----");
		TreeSet<Integer> ts=new TreeSet<Integer>();
		Collections.addAll(ts,67,44,234,234,56,23,44,67);
		System.out.println(ts);
		Iterator it=ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Map<Integer, String> m=new HashMap<Integer,String>();
		m.put(3,"dsuoa");
		m.put(6,"dajaz");
		m.put(1,"kazasta");
		System.out.println(m);
		
		
	}

}
