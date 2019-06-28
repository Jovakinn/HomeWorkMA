package com.homework01.figures;

public class Circle implements mainFunctional{

    // variable circle radius
    private double radius;

    // get radius
    public double getRadius() {
        return radius;
    }

    // set radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // constructor for circle with radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // constructor for circle without radius
    public Circle() {
    }

    // method for get area for our circle
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
