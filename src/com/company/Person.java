package com.company;

import java.util.Comparator;

public class Person  {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    String getName(){
        return this.name;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }


    protected void method(){
        System.out.println("dsada");
    }
    void method2(){
        System.out.println("dasda");
    }


//    @Override
//    public int compareTo(Object o) {
//        Person pers = (Person) o;
//        if(pers.age > this.age){
//            return -1;
//        } else if(pers.age == this.age){
//            return 0;
//        }else {
//            return 1;
//        }
//    }


//    @Override
//    public int compareTo(Object o) {
//        Person pers = (Person) o;
//        return this.name.compareTo(pers.name);
//    }
//
//
//    @Override
//    public String toString() {
//        return this.name + " - "+ age;
//    }
}
