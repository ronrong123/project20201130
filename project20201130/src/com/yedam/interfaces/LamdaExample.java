package com.yedam.interfaces;

import java.util.function.IntBinaryOperator;

public class LamdaExample {
	private static int[] scores = { 10, 50, 3 };

	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		// 최대값 얻기
		int max = maxOrMin(new IntBinaryOperator() {			
			@Override
			public int applyAsInt(int left, int right) {
				
				return left > right ? left:right;
			}
		});
		System.out.println("최대값: " + max);

		// 최소값 얻기
		int min = maxOrMin((int left, int right) -> {
				return left > right ? right:left;
			}
		);
		System.out.println("최소값: " + min);
	}

}
