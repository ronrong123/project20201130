package com.yedam.collection;

public class Employee {
	private int employeeId;
	private String laseName;
	private String email;
	private int salary;
	
	public Employee(int employeeId, String laseName, String email, int salary) {
		super();
		this.employeeId = employeeId;
		this.laseName = laseName;
		this.email = email;
		this.salary = salary;
	}

	
	public int getEmployeeId() {
		return employeeId;
	}

	public String getLaseName() {
		return laseName;
	}

	public String getEmail() {
		return email;
	}

	public int getSalary() {
		return salary;
	}
	
	
}
