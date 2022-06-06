package com.capgemini.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CalcTest2 {

	private static Calc cal;

	@BeforeAll
	public static void setup() {
		System.out.println("Testing started.");
		cal = new Calc();
	}

	@AfterAll
	public static void teardown() {
		System.out.println("Testing ended.");
		cal = null;
	}
 
	@BeforeEach
	public void abc() {
		System.out.println("Run once before each test case.");
	}

	@AfterEach
	public void def() {
		System.out.println("Run once after each test case.");
	}

	@Test
	public void testAddNums() {
		int expected = 30;
		int actual = cal.addNums(10, 20);
		assertEquals(expected, actual); // true
	}

	@Test
	public void testAddNums2() {

		int unexpected = 35;
		int actual = cal.addNums(10, 20);
		assertNotEquals(unexpected, actual); // true
	}

//	@Disabled
	@Test
	public void testAddNums3() {

		assertEquals(30, cal.addNums(10, 20)); // true
	}
}
