package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample2 {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student(101, "윤태현"), 90);
		map.put(new Student(102, "정병기"), 95);
		map.put(new Student(201, "김종인"), 70);
		map.put(new Student(201, "김종인"), 80);
		map.put(new Student(103, "정병기"), 88);
		// 1. keySet()
		Set<Student> set = map.keySet();
		for (Student student : set) {
			System.out.println("학번: " + student.getStudentNo() + ", 이름: " + student.getStudentName() + ", 점수: "
					+ map.get(student));
		}
		
		Set<Entry<Student, Integer>> entset = map.entrySet();
		int avg = 0;
		int max = 0;
		Student name = null;
		// 2. entrySet()

		for(Entry<Student, Integer> student : entset) {
			if(student.getValue() > max) {
				name = student.getKey();
				max = student.getValue();
			}
			avg += student.getValue();
		}
		avg = avg/entset.size();
		System.out.println("평균: " + avg);
		System.out.println("최고점수: " + max);
		System.out.println("최고점수받은학생: " + name.getStudentName());
	}

}