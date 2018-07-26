package com.ericsson.source;

public class MainClass {

	private static int addition;
	private static int subtraction;
	private static int multiplication;
	private static int division;
	
	
	public static void main(String[] args) {
		
		Arithmetic arithmetic = new Arithmetic();
		addition=arithmetic.addition(5,5);
		subtraction=arithmetic.subtraction(5,5);
		multiplication=arithmetic.multiplication(5,5);
		division=arithmetic.division(5,5);
		arithmetic.displayResults(addition,subtraction,multiplication,division);
	}


}
