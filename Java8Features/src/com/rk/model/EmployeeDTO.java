package com.rk.model;


public class EmployeeDTO {

	private String f;
	private String l;
	private int age;
	private long Salary;

	public String getF() {
		return f;
	}

	public void setF(String f) {
		this.f = f;
	}

	public String getL() {
		return l;
	}

	public void setL(String l) {
		this.l = l;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [f=" + f + ", l=" + l + ", age=" + age + ", Salary=" + Salary + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return Salary;
	}

	public void setSalary(long salary) {
		Salary = salary;
	}

}
