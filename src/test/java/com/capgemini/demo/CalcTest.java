package com.capgemini.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class CalcTest {

	@Test
	public void testAddNums() {

		Calc cal = new Calc();
		int expected = 30;
		int actual = cal.addNums(10, 20);
		assertEquals(expected, actual); // true
	}

	@Test
	public void testAddNums2() {

		Calc cal = new Calc();
		int unexpected = 35;
		int actual = cal.addNums(10, 20);
		assertNotEquals(unexpected, actual); // true
	}

	@Test
	public void testAddNums3() {

		Calc cal = new Calc();
		assertEquals(30, cal.addNums(10, 20)); // true
	}
}
