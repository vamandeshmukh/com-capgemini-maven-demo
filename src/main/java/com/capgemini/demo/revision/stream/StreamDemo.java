package com.capgemini.demo.revision.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

//		List<Employee> empList = new ArrayList<Employee>();
//		ArrayList<Employee> empList = new ArrayList<>();
		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(101, "Sonu", 50000));
		empList.add(new Employee(102, "Monu", 70000));
		empList.add(new Employee(103, "Tonu", 60000));
		empList.add(new Employee(104, "Gonu", 80000));
		empList.add(new Employee(105, "Ponu", 75000));

		System.out.println(empList.size());
		System.out.println(empList);

		System.out.println("List of all employees using for each loop:");
		for (Employee emp : empList) {
			System.out.println(emp.toString());
		}

		System.out.println("List of all employees using interator:");
		Iterator<Employee> it = empList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}

		System.out.println("List of all employees using lambda:");
		empList.forEach((emp) -> {
			System.out.println(emp.toString());
		});

		System.out.println("Using stream API...");
		System.out.println("Convert collection to stream");
		Stream<Employee> empStream = empList.stream();
		System.out.println("Convert stream to collection");
		System.out.println(empStream.collect(Collectors.toList()));

		System.out.println("List of employees with salary > 60000 using stream API:");
		Stream<Employee> empsWithMoreSalary = empList.stream();
		empsWithMoreSalary.filter((emp) -> {
			return emp.getSalary() > 60000;
		}).forEach((emp) -> {
			System.out.println(emp.toString());
		});

	}
}

//package com.capgemini.demo.revision.stream;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class StreamDemo {
//
//	public static void main(String[] args) {
//
//   generics demo
////		List myList = new ArrayList();
//		List<Integer> myList = new ArrayList<>();
//
//		myList.add(10);
//		myList.add(20);
////		myList.add(10.5);
////		myList.add("abc");
//
//		System.out.println(myList);
//
//	}
//
//}
