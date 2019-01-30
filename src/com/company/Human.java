package com.company;

public class Human {
    String name;
    String lastName;
    boolean sex;


    Human(String name, String lastname, boolean sex){
        this.name = name;
        this.lastName = lastname;
        this.sex = sex;
    }


    public void run(){
        System.out.println("Я бегу");
    }

    public void sleep(){
        System.out.println("Zzzz...");
    }





}
