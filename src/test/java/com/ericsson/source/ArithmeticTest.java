package com.ericsson.source;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class ArithmeticTest {

	public Arithmetic arithmetic;
	
	@Before
	public void before() {
		arithmetic=new Arithmetic();
	}
	
	@Test
	public void testAddition() {
		int result=arithmetic.addition(1, 9);
		Assert.assertEquals(10, result);
	}
	
	@Test
	public void testSubtraction() {
		int result = arithmetic.subtraction(9, 8);
		Assert.assertEquals(1, result);
	}
	
	@Test
	public void testMultiplication() {
		int result = arithmetic.multiplication(5, 4);
		Assert.assertEquals(20, result);
	}
	
	@Test
	public void testDivision() {
		int result = arithmetic.division(9, 3);
		Assert.assertEquals(3, result);
	}
	
}
