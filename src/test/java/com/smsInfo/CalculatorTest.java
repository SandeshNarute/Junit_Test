package com.smsInfo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator calculator = new Calculator();

	@Test
	public void sumTest() {

		int actualResult = calculator.sum(15, 20);
		System.out.println("Actual rsult " + actualResult);
		int expectedResult = 35;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void subTest() {
		int actualResult = calculator.Sub(20, 5);
		System.out.println("Actual rsult " + actualResult);
		int expectedResult = 15;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void multiTest() {
		int actualResult = calculator.Multi(20, 20);
		System.out.println("Actual rsult " + actualResult);
		int expectedResult = 400;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void divTest() {
		int actualResult = calculator.Div(20, 5);
		System.out.println("Actual rsult " + actualResult);
		int expectedResult = 4;
		assertEquals(expectedResult, actualResult);
	}
}
