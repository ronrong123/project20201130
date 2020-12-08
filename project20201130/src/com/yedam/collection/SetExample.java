package com.yedam.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World");
		set.add("World2");
		set.add("Welcome");
		// 순서를 유지하지 않고 저장, 중복값제외

//		for (String str : set) {
//			System.out.println(str);
//		}

		Iterator<String> iter = set.iterator();

		while (iter.hasNext()) {// hasNext: 값이있는지물어봄
			String str = iter.next(); // next: 가져옴
			System.out.println(iter.next());
		}
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);
		list.add(35);
		list.add(40);
		list.add(20);
		list.add(25);

		int sum = 0;
		for(Integer i:list) {
			sum += i;			
		}
		System.out.println("전체합: " + sum);
		sum = 0;
		Set<Integer> numbers = new HashSet<>();//set은 HashSet으로 값을 불러올수있다.(List의 ArrayList랑 같은듯)
		numbers.add(10);
		numbers.add(15);
		numbers.add(20);
		numbers.add(25);
		numbers.add(30);
		numbers.add(35);
		numbers.add(40);
		numbers.add(20);
		numbers.add(25);
		
		for(Integer i:numbers) {
			sum += i;
		}
		System.out.println("중복제외합: " + sum);
	}
}
