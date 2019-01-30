package com.company;

import java.util.ArrayList;

public class Animal {

    private String name;
    private int age;
    private String motherCountry;
    private boolean isHunghry;

    private ArrayList<Animal> children;




    public Animal(String name, int age, String motherCountry) {
        this.name = name;
        this.age = age;
        this.motherCountry = motherCountry;
        isHunghry = true;
        children = new ArrayList<Animal>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMotherCountry() {
        return motherCountry;
    }

    public void setMotherCountry(String motherCountry) {
        this.motherCountry = motherCountry;
    }

    public Animal born(String name, String motherCountry){
        Animal child =  new Animal(name,0, motherCountry);
        this.children.add(child);
        return child;
    }

    public ArrayList<Animal> getChildren() {
        return children;
    }

    public void eat(){
        isHunghry = false;
    }





    @Override
    public String toString() {
        return name + "\nMother country: " + motherCountry;
    }
}
