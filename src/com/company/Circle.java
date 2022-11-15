package com.company;

public class Circle extends Shape {
    private double i;
    private double PI = 3.14;

    public Circle(double i){
        this.i = i;
    }

    @Override
    public double getPerimetr() {
        return 2*PI*i;
    }
}
