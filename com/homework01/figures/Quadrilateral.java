package com.homework01.figures;

public class Quadrilateral extends Square {

    // base our quadrilateral
    private double base;

    // getter base
    public double getBase() {
        return base;
    }

    // setter base
    public void setBase(double base) {
        this.base = base;
    }

    // constructor with side and base
    public Quadrilateral(double side, double base) {
        super(side);
        this.base = base;
    }

    // constructor without base and side
    public Quadrilateral() {
    }

    // method get area our quadrilateral
    @Override
    public double getArea() {
        return base * getSide();
    }
}
