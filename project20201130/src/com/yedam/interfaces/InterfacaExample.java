package com.yedam.interfaces;

interface Runnable {
	public void run();
}

class AutoRun implements Runnable {
	@Override
	public void run() {
		System.out.println("자동실행.");
	}

}

class NewRun implements Runnable {
	@Override
	public void run() {
		System.out.println("새로운실행.");
	}
}

public class InterfacaExample {
	public static void main(String[] args) {
		Runnable runnable = new AutoRun();
		runnable.run();
		runnable = new NewRun();
		runnable.run();

		// 인터페이스는 기능에 대한 정의만 해놓기때문에 new라는 키워드로 생성하지못하지만 중괄호 영역으로 선언해서 쓸수있다.
		runnable = () -> System.out.println("또다른 익명 실행.");//람다표현식: 표현을 줄일만큼 줄이고 간단하게 표현하는것
		runnable.run();
	}
}
