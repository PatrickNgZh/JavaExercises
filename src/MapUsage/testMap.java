package MapUsage;

import java.util.HashMap;
import java.util.Map;

public class testMap {
	public static void main(String[] args) {
		Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
		mp.put(2, 3);
		System.out.println(mp.get(1));
		mp.put(1, 2);
		mp.put(3, 4);
		for (Map.Entry<Integer, Integer> entry: mp.entrySet()) {
			System.out.println(entry.getKey()+"	"+entry.getValue());
		}
	}
}
