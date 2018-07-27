package com.ericsson.source;

public class Arithmetic {
	
	public int addition(int a, int b) {
		return a+b;
	}
	
	public int subtraction(int a, int b) {
		return a-b;
	}
	
	public int multiplication(int a, int b) {
		return a*b;
	}
	
	public int division(int a, int b) {
		return a/b;
	}

	public void displayResults(int addition, int subtraction, int multiplication, int division) {
		
		System.out.println("Addition : "+addition);
		System.out.println("Subtraction : "+subtraction);
		System.out.println("Multiplication : "+multiplication);
		System.out.println("Division : "+division);
	}
}
