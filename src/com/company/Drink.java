package com.company;

public class Drink {

    private String name;
    private boolean isAlchocolic;
    private String colour;


    public Drink(String name, boolean isAlchocolic, String colour) {
        this.name = name;
        this.isAlchocolic = isAlchocolic;
        this.colour = colour;
    }

    Drink(){

    }

    public String getName() {
        return name;
    }

    public boolean isAlchocolic() {
        return isAlchocolic;
    }

    public String getColour() {
        return colour;
    }

    public Drink(String name) {
        this.name = name;
    }

    public static void staticMethod(){
        System.out.println("Static");
    }


    public void nonStaticMethod(){
        System.out.println("Non - static");
    }



    public void setName(String name) {
        this.name = name;
    }



    public void setAlchocolic(boolean alchocolic) {
        isAlchocolic = alchocolic;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
