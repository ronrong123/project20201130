package com.yedam.collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(87, "Hong");
		scores.put(98, "Hwang");
		scores.put(75, "Choi");
		scores.put(95, "Park");
		scores.put(80, "Kim");
		Set<Integer> set = scores.keySet();
		for(Integer num : set) {
			System.out.println(num);
		}
		for(Map.Entry<Integer, String> ent : scores.entrySet()) {
			System.out.println(ent);
		}
		
		Map.Entry<Integer, String> ent = scores.firstEntry();
		ent.getKey();
		ent.getValue();
		
		ent = scores.lastEntry();
		ent.getKey();
		ent.getValue();
		
	}

}
