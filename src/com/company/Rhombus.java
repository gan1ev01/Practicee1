package com.company;

public class Rhombus extends Shape {
    private int a;
    private int b;
    private int c;
    private int d;

    public Rhombus(int a, int b, int c, int d){
        this.a = a;
        this.a = b;
        this.a = c;
        this.a = d;
    }

    @Override
    public double getPerimetr() {
        return a+b+c+d;
    }
}
