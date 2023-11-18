package collections;

import java.util.ArrayList;

public class arraylist {
      public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(3);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		list.add(30);
		System.out.println(list);
		list.add(null);
		System.out.println(list);
		list.add(1, 3);
		System.out.println(list);
		list.add(0, 143);
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list.clone());
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		list.contains(143);
		System.out.println(list.contains(143));
		System.out.println(list.size());
		
	}
}
