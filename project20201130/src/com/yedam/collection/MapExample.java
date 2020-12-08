package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		// <key, value>
		map.put("Hong", 15);
		map.put("Hwang", 20);
		map.put("Hong1", 25);
		// map는 add가 아닌 put을로 값을 저장함

		Integer val = map.get("Hong");
		// get은 value(값)을 받아옴(Hong의 값 15를 가져온다.)
		System.out.println(val);	


		Set<String> set1 = map.keySet();
		// keySet: key값에 있는 모든값을 가져옴

		System.out.println("====================");
		for(String str : set1) {
			System.out.println("key: " + str + ", val: " + map.get(str));
		}		
		System.out.println("====================");
		Set<Entry<String, Integer>> entry = map.entrySet();
		//entrySet는 key, value의 값을 모두 가져옴 
		for(Entry<String, Integer> ent : entry) {
			System.out.println("key:" + ent.getKey() + ", value: " + ent.getValue());
		}
				
				
		Map<Integer, String> mapInt = new HashMap<>();
		
		mapInt.put(10, "김다현");
		mapInt.put(20, "이혜빈");
		mapInt.put(30, "이나경");
		String result = mapInt.get(10);
		System.out.println(result);

		Set<Integer> set = mapInt.keySet();
		// key값에 있는 모든값을 가져와 set에 담아주겠다

		System.out.println("====================");
		for (Integer num : set) {
			System.out.println("key: " + num + ", val: " + mapInt.get(num));
			// get이라는 메소드에 key값을 넣어주면 value값이 나옴
		}

		System.out.println("====================");
		Set<Entry<Integer, String>> entrySet = mapInt.entrySet();
		//entrySet: map에 들어있는 key, value를 전부 가져옴
		for(Entry<Integer, String> ent : entrySet) {
			System.out.println("key: " + ent.getKey() + ", val: " + ent.getValue());
		}

	}
}
