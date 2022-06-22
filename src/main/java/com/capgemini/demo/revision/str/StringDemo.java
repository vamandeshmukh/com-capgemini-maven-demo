package com.capgemini.demo.revision.str;

public class StringDemo {

	public static void main(String[] args) {

		String str1 = "abcdefghij";

		System.out.println(str1);
		System.out.println(str1.charAt(3));

		System.out.println(str1.indexOf('c'));
		
//		str1.

		String str2 = "Sonu, Monu, Tonu, Gonu";

		String[] arr = str2.split(", ");
		


		for (String s : arr)
			System.out.println(s);
		
		
		String str3 = "Abcf12Ef3Gh";
		
		


	}
}
