package com.examples;

import com.examples.errors.StackOverFlowExample;
import com.examples.exceptions.checked.IOExample;
import com.examples.exceptions.checked.MyCheckedException;
import com.examples.exceptions.unchecked.ArithmeticExample;
import com.examples.exceptions.unchecked.MyUncheckedException;
import com.examples.java7.multicatch.MutiCatchExample;
import com.examples.java7.trywithresources.Connection;
import com.examples.java7.trywithresources.ProcessConnection;

public class RunExamples {

	public static void main(String[] args) {
//		runErrorStackOverFlowExample();
//		runUncheckedExceptionArithmeticExample();
//		runCheckedExceptionIOExample();
//		runMyUncheckedException();

//		try {
//			runMyCheckedException();
//		} catch (MyCheckedException ex) {
//			System.out.println(ex.getMessage());
//		}
		
//		runMultiCatchExample();
		runTryWithResourcesExample();
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
	
	private static void runMyUncheckedException() {
		throw new MyUncheckedException("My uncheked exception");
	}
	
	private static void runMultiCatchExample() {
		MutiCatchExample m = new MutiCatchExample();
		m.process();
	}
	
	private static void runTryWithResourcesExample() {
		new ProcessConnection().connect();
	}

}
