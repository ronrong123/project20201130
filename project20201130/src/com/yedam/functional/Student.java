package com.yedam.functional;

public class Student {
	private String name;
	private int enfScore;
	private int mathScore;

	public Student(String name, int enfScore, int mathScore) {
		super();
		this.name = name;
		this.enfScore = enfScore;
		this.mathScore = mathScore;
	}

	public String getName() {
		return name;
	}

	public int getEnfScore() {
		return enfScore;
	}

	public int getMathScore() {
		return mathScore;
	}

}
