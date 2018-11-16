package com.examples.errors;

public class StackOverFlowExample {

	public void execute() {
		execute();
		System.out.println("The method was executed!");
	}
}
