package com.XMLCongifuration;

public class Employee {
	private int emp_id;
	private String emp_name;
	private int salary;

	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", salary=" + salary + "]";
	}

	public Employee() {

	}

	public Employee(int emp_id, String emp_name, int salary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.salary = salary;
	}

}
