package com.company;

public class Circle extends Figure {

    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    Circle(double radius){
        this.radius = radius;
    }

    Circle(){
    }



    @Override
    protected double square() {
        return Figure.PI * radius * radius;
    }
}
