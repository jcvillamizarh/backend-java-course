package com.platzi.course.operators;

public class MathOperations {

    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;
        //Ceil:it returns a int value from a double value upwards
        System.out.println(Math.ceil(x));
        //floor: it returns a int value from a double down
        System.out.println(Math.floor(x));
        //pow: returns a number raised to another number
        System.out.println(Math.pow(x, y));
        //max: returns the largest number
        System.out.println(Math.max(x,y));
        //square a number
        System.out.println(Math.sqrt(y));
        //A circle area PI * r2
        System.out.println(Math.PI * Math.pow(y, 2));
        // A sphere area
        System.out.println(4 * Math.PI * Math.pow(y, 2));
        //Volume of a sphere
        System.out.println((4/3) * Math.PI * Math.pow(y, 3));
    }
}
