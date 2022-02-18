package com.platzi.course.variables;

public class CastVariables {
    public static void main(String[] args) {
        /*
            In one year I found 30 dogs, I would like to know how many I found in a month
         */

        double monthlyDogs = 30/12;
        System.out.println(monthlyDogs);
        //estimate this data to the number I need, that's why I use cast
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //now i need exactly the number, and I want the average
        int a = 30, b = 12;
        System.out.println((double) a/b);
        /* Casting between types
        .::Automatic::.
            byte -> short
            short -> int
            char -> int
            int -> long
            long -> float
            float -> double

        .::Necessary::.
            double -> float
            float -> long
            long -> int
            int -> short
            short -> byte

            char <-> byte
            char <-> short
            int -> char
         */


    }
}
