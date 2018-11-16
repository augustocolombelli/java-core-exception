package com.examples.java7.trywithresources;

public class ProcessConnection {

	public void connect() {

		try (Connection connection = new Connection()) {
			connection.open();
			connection.process();
		}
	}

}
