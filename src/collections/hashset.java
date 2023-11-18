package collections;

import java.util.HashSet;

public class hashset {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(143);
		set.add(243);
		set.add(134);
		set.add(null);
		set.add(null);
		set.add(8);
		System.out.println(set);
		System.out.println(set);
		System.out.println(set);
		System.out.println(set);
		System.out.println(set);
		System.out.println(set);
		set.remove(134);
		System.out.println(set);
		set.remove(null);
		System.out.println(set);
		System.out.println(set);
		
		for (Integer xyz : set) {
			System.out.println(xyz);
			
		}

	}

}