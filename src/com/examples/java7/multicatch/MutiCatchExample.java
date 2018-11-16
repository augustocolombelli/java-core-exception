package com.examples.java7.multicatch;

import java.util.Random;

public class MutiCatchExample {

	public void process() {
		try {
			execute();
		} catch (ExampleOneException | ExampleTwoException ex) {
			System.out.println(ex.getMessage());
		}
	}

	private void execute() throws ExampleTwoException {

		if (new Random().nextBoolean()) {
			throw new ExampleTwoException("Example two");
		} else {
			throw new ExampleOneException("Example one");
		}

	}

}
