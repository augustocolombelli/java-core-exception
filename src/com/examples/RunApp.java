package com.examples;

import com.examples.errors.StackOverFlowExample;
import com.examples.exceptions.unchecked.ArithmeticExample;

public class RunApp {

	public static void main(String[] args) {
//		runErrorStackOverFlowExample();
		runUncheckedExceptionArithmeticExample();
	}
	
	private static void runErrorStackOverFlowExample() {
		StackOverFlowExample stackOverFlowExample = new StackOverFlowExample();
		stackOverFlowExample.execute();
	}
	
	private static void runUncheckedExceptionArithmeticExample() {
		ArithmeticExample arithmeticExample = new ArithmeticExample();
		arithmeticExample.execute();
	}
	
}
