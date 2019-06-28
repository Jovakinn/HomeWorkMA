package com.homework01.figures;

public class Triangle implements mainFunctional {

    // variables for our right triangle
    private double base;
    private double height;

    // get base method
    public double getBase() {
        return base;
    }

    // set base method
    public void setBase(double base) {
        this.base = base;
    }

    // get height method
    public double getHeight() {
        return height;
    }

    // set height method
    public void setHeight(double height) {
        this.height = height;
    }

    // constructor for triangle with base and height
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // constructor triangle without base and height
    public Triangle() {
    }

    // get area method for triangle
    @Override
    public double getArea() {
        return  (base * height) / 2;
    }
}
