package com.yedam.generic;

public class Util {

	public static <T, M> boolean compare(Pair<T, M> p1, Pair<T, M> p2) {
		boolean k = p1.getkind().equals(p2.getkind());
		boolean m = p1.getModel().equals(p2.getModel());
		
		
		return m;
	}

	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}	
