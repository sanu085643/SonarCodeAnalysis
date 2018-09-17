package com.sonar.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestClass {
	
	Calculation obj = new Calculation();
	
	@Test
	public void testAdd() {
		Integer actual = obj.adder(2, 2);
		Integer expected = 4;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSub() {
		Integer actual = obj.sub(4, 2);
		Integer expected = 7;
		assertEquals(expected, actual);
	}

}
