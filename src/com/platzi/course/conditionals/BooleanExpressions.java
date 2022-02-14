package com.platzi.course.conditionals;

public class BooleanExpressions {

    public static void main(String[] args) {
         // equality -> == -> a == b
        // inequality -> != -> a != b
        /*
            Logic Operators
            && -> And -> a && b
            || -> Or  -> a || b
            !  -> not -> !a
         */

        int a = 5;
        int b = 8;
        System.out.println("A is equal to b -->" + (a == b));
        System.out.println("A is different to b -->" + (a != b));
        //Relational operators
        System.out.println("A is greater than b -->" + (a > b));
    }
}
