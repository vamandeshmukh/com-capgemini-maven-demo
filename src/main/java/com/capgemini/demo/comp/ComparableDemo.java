package com.capgemini.demo.comp;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {

		ArrayList<Employee> empList = new ArrayList<>();

		empList.add(new Employee(105, "Sonu", 50000.45));
		empList.add(new Employee(101, "Monu", 60000.47));
		empList.add(new Employee(103, "Tonu", 40000.50));
		empList.add(new Employee(104, "Ponu", 80000.22));
		empList.add(new Employee(102, "Gonu", 65000.31));

		System.out.println("Employees as per insertion order:");
		for (Employee emp : empList) {
			System.out.println(emp.toString());
		}

		// Employee class needs to implement Comparable and override compareTo
		Collections.sort(empList);

		System.out.println("Employees after sorting:");
		for (Employee emp : empList) {
			System.out.println(emp.toString());
		}
	}

}
