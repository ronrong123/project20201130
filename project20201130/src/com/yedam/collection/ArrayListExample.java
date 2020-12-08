package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("Hello");
		list.add("World");
		list.add("Welcome");
		list.add(1, "Nice");
		System.out.println("size: " + list.size());
		list.add(list.size(), "last");
		// list.size() : 리스트의 크기에 해당되는 위치

		list.remove(1);
		// list는 length가 아닌 list로 크기를 읽어옴
		for (int i = 0; i < list.size(); i++) {
			System.out.println("index: " + i + ", " + list.get(i));
		}
		
		List<Integer> listNum = new ArrayList<>();
		listNum.add(100);
		listNum.add(200);
		listNum.add(300);
		int sum = 0;
		
		for(Integer num : listNum) {
			sum += num;
		}
		System.out.println("listNum합계: " + sum);
		
	}

}
