package com.platzi.course.operators;
public class Operators {
    /*
        Assignment operators

        Operator - Application - Breakdown
        +=         a += b        a = a + b
        -=         a -= b        a = a - b
        *=         a *= b        a = a * b
        /=         a /= b        a = a / b
        %=         a %= b        a = a % b
        ++         i++           i = i + 1
        --         i--           i = i - 1

     */
    public static void main(String[] args) {
        var number = 10;
        number += 20;
        System.out.println("Number: " + number);

        //Using increment and decrement with suffix and prefix
        //sufix
        int lives = 5;
        lives--;
        lives--;
        System.out.println("Lives: " + lives);
        lives++;
        System.out.println("Lives: "+ lives);
        //prefix
        //it wins a gift for a live
        int gift = 100 + lives++;
        System.out.println("Gift:" + gift);
        gift = 100 + ++lives;
        System.out.println("Gift:" + gift);

    }



}
