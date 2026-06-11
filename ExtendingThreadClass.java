package com.example.Multithreading;


public class ExtendingThreadClass extends Thread {
	public void run() {
		System.out.println("Thread Running");
	}

	
	public static void main(String[] args) {
		ExtendingThreadClass t = new ExtendingThreadClass();
		t.start();
	}
}
