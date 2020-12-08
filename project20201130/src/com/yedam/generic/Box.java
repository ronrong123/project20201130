package com.yedam.generic;

public class Box<T> {
	//<T> 메인클래스에서 선언할떄 타입을 설정한다 
	T obj;
	//object는 모든 클래스의 부모(최상위클래스)	
	void set(T obj) {
		this.obj = obj;	
	}
	T get() {
		return obj;
	}
	
	
	
	
	
}
