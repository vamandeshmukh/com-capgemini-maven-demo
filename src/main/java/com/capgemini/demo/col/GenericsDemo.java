package com.capgemini.demo.col;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

	public static void main(String[] args) {

//		List marks = new ArrayList();
//		List<int> marks = new ArrayList<>();
		List<Integer> marks = new ArrayList<>();

		marks.add(98);
		marks.add(95);
//		marks.add(99.99);
//		marks.add("abc");
//		marks.add(false);

		System.out.println(marks);
		
		

	}

}
