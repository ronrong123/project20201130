package com.yedam.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List <Students> list = Arrays.asList(
			new Students("홍길동", "남자", 90),
			new Students("김순희", "여자", 90),
			new Students("김자바", "남자", 95),
			new Students("박한나", "여자", 92)			
			);
	public static double avg (Predicate<Students> Predicate) {
		int count = 0, sum=0;
		for(Students student:list) {
			if(Predicate.test(student)) {
				count ++;
				sum += student.getScore();				
			}
		}	
		return (double) sum/count;
	}
	public static void main(String[] args) {
		double maleAvg = avg(new Predicate<Students>() {
			@Override
			public boolean test(Students t) {
				// TODO Auto-generated method stub
				return t.getSex().equals("남자");
			}			
		});
		System.out.println("남자 평균 점수: " + maleAvg);
//		double maleAvg = avg(t->t.getSex().equals("남자"));
//		System.out.println("남자 평균 점수: " + maleAvg);
		
		double femaleAvg = avg(t -> t.getSex().equals("여자"));
		System.out.println("여자 평균 점수: " + femaleAvg);
	}
	
}
