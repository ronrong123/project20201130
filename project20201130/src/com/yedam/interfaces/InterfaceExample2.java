package com.yedam.interfaces;
// 함수적 인터페이스(Functional Interface)

interface Cal {
	public void multi(int num);
	//람다식을 사용하려면 인터페이스 안에 한가지의 추상메소드만 존재해야한다.
	//람다표현식은 추상메소드가 하나일때만 구현가능
}
interface Calculate {
	public void sum(int num1, int num2);
}

public class InterfaceExample2 {
	public static void main(String[] args) {
		Calculate calcu = (int num1, int num2) -> {
				System.out.println(num1 + num2);
			
		};
		calcu.sum(3, 5);
		
		calcu = (a,b) ->{
			System.out.println(a*b);
		};
		calcu.sum(3, 5);
		
		Cal cal = (num) -> {
			int result = num * 2;
			System.out.println(result);
		};
		cal.multi(3);
		
		cal = (a) -> {
			int result = a*a;
			System.out.println(result);
		};
		cal.multi(3);
	}
}
