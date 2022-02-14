package com.platzi.course.functions;

public class FunctionExample {

    public static void main(String[] args) {
        //A circle area PI * r2
        System.out.println(circleArea(3));
        // A sphere area
        System.out.println(sphereArea(3));
        //Volume of a sphere
        System.out.println(sphereVolume(5));
        System.out.println(converToDollar(10000,"COP"));
    }

    private static double circleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    private static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    private static double sphereVolume(double r){
        return (4/3) * Math.PI * Math.pow(r, 3);
    }

    private static double converToDollar(double quantity, String currency) {
        switch (currency) {
            case "MXN":
                quantity = quantity * 0552;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }

}
