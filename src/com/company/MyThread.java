package com.company;

public class MyThread implements Runnable {
    String name;
    MyThread(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.name + " - " + i);
        }
    }
}
