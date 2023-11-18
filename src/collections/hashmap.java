package collections;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "orange");
		map.put(2, "apple");
		map.put(3, null);
		map.put(4,"yello");
		System.out.println(map);
		System.out.println(map);
		System.out.println(map);
		System.out.println(map);
		map.put(4," mango");
		System.out.println(map);
		System.out.println(map.containsValue("4"));
		System.out.println(map.keySet());
		
		

	}

}
