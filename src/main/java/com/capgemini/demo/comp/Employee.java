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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eid;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (eid != other.eid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
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
