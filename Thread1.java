package com.example.Multithreading;

class Thread1 extends Thread {
    int num;
    Thread1(int num) {
        this.num = num;
    }
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
