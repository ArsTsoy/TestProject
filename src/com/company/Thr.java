package com.company;

public class Thr extends Thread {
    private int num;
    private String name;

    Thr(int num, String name){
        this.name = name;
        this.num = num;
    }

    @Override
    public void run() {
        for(int i = 0; i < num; i++){
            System.out.println(name + " выдал: "  + i);
        }
    }

    public void method(){
        System.out.println("dasda");
    }
}
