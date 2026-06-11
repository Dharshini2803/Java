package com.example.Multithreading;

public class MainTable {

	public static void main(String[] args) {
		Thread t1 = new Thread1(3);
        Thread2 t2 = new Thread2(2);
        t1.start();
        t2.start();
	}

}
