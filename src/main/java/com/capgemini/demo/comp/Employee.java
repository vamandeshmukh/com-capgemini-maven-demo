package com.capgemini.demo.comp;

public class Employee implements Comparable<Employee> {

	private int eid;
	private String name;
	private double salary;

	public Employee() {
		super();
	}

	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

//	// order by eid
//	@Override
//	public int compareTo(Employee emp) {
//		System.out.println("compareTo()");
//		return this.eid - emp.eid;
//	}

	// order by salary
	@Override
	public int compareTo(Employee emp) {
//		return (int) (this.salary - emp.salary);
		return Double.valueOf(this.salary).compareTo(Double.valueOf(emp.salary));
	}

//	// order by name 
//	@Override
//	public int compareTo(Employee emp) {
////		return 0;
//	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}

	public Double getSalary() {
		return this.salary;
	}

}

//package com.capgemini.demo.comp;
//
//public class Employee {
//
//	private int eid;
//	private String name;
//	private double salary;
//
//	public Employee() {
//		super();
//	}
//
//	public Employee(int eid, String name, double salary) {
//		super();
//		this.eid = eid;
//		this.name = name;
//		this.salary = salary;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
//	}
//
//}
