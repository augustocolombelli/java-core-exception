package com.examples;

import com.examples.errors.StackOverFlowExample;
import com.examples.exceptions.checked.IOExample;
import com.examples.exceptions.checked.MyCheckedException;
import com.examples.exceptions.unchecked.ArithmeticExample;

public class RunExamples {

	public static void main(String[] args) {
//		runErrorStackOverFlowExample();
//		runUncheckedExceptionArithmeticExample();
//		runCheckedExceptionIOExample();

		try {
			runMyCheckedException();
		} catch (MyCheckedException ex) {
			System.out.println(ex.getMessage());
		}
	}

	private static void runErrorStackOverFlowExample() {
		StackOverFlowExample stackOverFlowExample = new StackOverFlowExample();
		stackOverFlowExample.execute();
	}

	private static void runUncheckedExceptionArithmeticExample() {
		ArithmeticExample arithmeticExample = new ArithmeticExample();
		arithmeticExample.execute();
	}

	private static void runCheckedExceptionIOExample() {
		IOExample ioExample = new IOExample();
		ioExample.process();
	}

	private static void runMyCheckedException() throws MyCheckedException {
		throw new MyCheckedException("My checked exception!");
	}

}
