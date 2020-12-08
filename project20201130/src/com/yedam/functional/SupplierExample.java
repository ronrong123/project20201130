package com.yedam.functional;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		// 매개값 x -> 반환값 o
		Supplier<String> sup = null;
		sup = new Supplier<String>() {
			@Override
			public String get() {
				return "Hello";
			}			
		};
		System.out.println(sup.get());
		
		Supplier<Integer> intSup = new Supplier<Integer>() {
			@Override
			public Integer get() {
				int result = 35 * 20;
				return result;
			}			
		};
		System.out.println(intSup.get());
		IntSupplier intSupp = () ->(int) (Math.random()*6) + 1;
		System.out.println(intSupp.getAsInt());
	}

}
