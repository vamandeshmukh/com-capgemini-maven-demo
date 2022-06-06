package com.capgemini.demo.hash;

public class EmpDemo {

	public static void main(String[] args) {

		Employee emp = new Employee(101, "Sonu", 50000);

		Employee emp2 = new Employee(102, "Monu", 55000);
//		Employee emp2 = new Employee(101, "Sonu", 50000);

		System.out.println(emp.hashCode());
		System.out.println(emp2.hashCode());

		System.out.println(emp.equals(emp2));

	}

}
