package com.homework01.figures;

public class Square implements mainFunctional {

    // side our square
    private double side;

    // get side our square
    public double getSide() {
        return side;
    }

    // set side square
    public void setSide(double side) {
        this.side = side;
    }

    // constructor our square with side
    public Square(double side) {
        this.side = side;
    }

    // constructor our square without side
    public Square() {
    }

    // method to get area from our square
    @Override
    public double getArea() {
        return side * side;
    }
}
