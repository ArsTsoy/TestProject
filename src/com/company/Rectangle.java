package com.company;

import java.sql.ResultSet;

public class Rectangle extends Figure {

    private  double a;
    private  double b;

    Rectangle(double length, double width){
        this.a = length;
        this.b = width;
    }

    Rectangle(double a){
        this.a = a;
        this.b = a;
    }

    @Override
    protected double square() {
        return a * b;
    }
}
