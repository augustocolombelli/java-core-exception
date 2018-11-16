package com.examples;

import com.examples.errors.ErrorExample;

public class RunApp {

	public static void main(String[] args) {
		runErrorExample();
	}
	
	private static void runErrorExample() {
		ErrorExample errorExample = new ErrorExample();
		errorExample.executeMethodThatThrowError();
	}
	
}
