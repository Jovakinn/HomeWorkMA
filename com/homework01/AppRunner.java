package com.homework01;

import com.homework01.figures.*;
import java.util.*;

public class AppRunner {
    public static void main(String[] args) {
        // circle with radius 5
        Circle circle = new Circle(5);

        // triangle with  base 3, height 4
        Triangle triangle = new Triangle(3,4);

        // square with side 5
        Square square = new Square(5);

        // quadrilateral with side 2 and base 6
        Quadrilateral quadrilateral = new Quadrilateral(2,6);

        // create ArrayList with figures area's
        ArrayList<Double> list = new ArrayList<>();

        // adding area's
        list.add(circle.getArea());
        list.add(triangle.getArea());
        list.add(square.getArea());
        list.add(quadrilateral.getArea());

        // calculating max area
        double maxShape =  Collections.max(list);

        // data output...
        System.out.println("Circle has area " + circle.getArea());

        System.out.println("Triangle has area " + triangle.getArea());

        System.out.println("Square has area " + square.getArea());

        System.out.println("Quadrilateral has area " + quadrilateral.getArea());

        System.out.println();

        System.out.println("The biggest area of this figures is: " + maxShape);
       }
    }
