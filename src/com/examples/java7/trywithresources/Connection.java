package com.examples.java7.trywithresources;

public class Connection implements AutoCloseable {

	public void open() {
		System.out.println("Starting the process...");
	}

	public void process() {
		System.out.println("Process is running...");
		throw new ConnectionException("Problems with connection!");
	}

	public void finish() {
		System.out.println("Finishing the process");
	}

	public void close() throws ConnectionException {
		System.out.println("Close...");
		this.finish();
	}

}
