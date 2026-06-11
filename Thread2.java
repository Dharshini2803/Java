package com.example.Multithreading;

class Thread2 extends Thread {
    int num;
    Thread2(int num) {
        this.num = num;
    }
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
