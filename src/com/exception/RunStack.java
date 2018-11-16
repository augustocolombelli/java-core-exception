package com.exception;

public class RunStack {

	public static void main(String[] args) {
		System.out.println("Main start");
		new RunStack().executeOne();
		System.out.println("Main finish");
	}

	public void executeOne() {
		System.out.println("Start 1");
		try {
			executeTwo();
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Finish 1");
		
		try {}
		finally {}
	}

	private void executeTwo() {
		System.out.println("Start 2");
		executeTree();
		System.out.println("Finish 2");
	}

	private void executeTree() {
		System.out.println("Start 3");
		Person person = null;
		person.setName("Hector");
//		int x = 3 / 0;
		System.out.println("Finish 3");
	}

}
