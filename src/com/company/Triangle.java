package com.company;

public class Triangle extends Figure {
    private double height;
    private double side;




    Triangle(double height, double side){
        this.height = height;
        this.side = side;
    }

    @Override
    protected double square() {
        return 0.5 * side * height;
    }


}
