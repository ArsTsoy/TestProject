package com.company;

public class JavaThread extends Thread {
    private String name;

    JavaThread(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " has started");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " has finished");
    }
}
