package com.examples.exceptions.checked;

import java.io.IOException;

public class IOExample {

	public void process() {
		try {
			execute();
		} catch (IOException ex) {
			System.out.println("Error treatment");
			ex.printStackTrace();
		}
	}

	private void execute() throws IOException {
		throw new IOException();
	}

}
