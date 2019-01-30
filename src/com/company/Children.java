package com.company;

public class Children {
    private String name;
    private String surmame;
    private int age;

    Children(String name,String surname,int age){
        this.name = name;
        this.surmame = surname;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSurmame(String surmame){
        this.surmame = surmame;
    }

    public String getSurmame(){
        return surmame;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }


    static Children born(String name, String lastName){
        Children children = new Children(name, lastName, 0);
        return children;
    }


//    public String toString() {
//        return "Name: " + name + "\nSurname: " + surmame + "\nAge: " + age;
//    }
}
