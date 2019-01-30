package com.company;

public class Cat extends HomeAnimal {



    public Cat(String name) {
        super(name);
    }


    public void eat(){
        System.out.println("Я кушаю");
    }

    public void eat(String food){
        System.out.println("Я кушаю" + food);
    }

    public void eat(int food){
        System.out.println("Я кушаю" + food);
    }

    public void eat(String food, String food2){
        System.out.println("Я кушаю" + food);
    }


    @Override
    public String getVoice() {
        return "Meaw...meaw...";
    }
}
