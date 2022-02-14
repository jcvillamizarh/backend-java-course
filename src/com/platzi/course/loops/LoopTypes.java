package com.platzi.course.loops;

import java.util.Scanner;

public class LoopTypes {

    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
        //doWhileLoop();
        //whileLoop();
        forLoop();

    }

    private static void doWhileLoop() {
        int response = 0;
        do{
            System.out.println("Select the number of the wished option");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Exit");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch (response) {
                case 0:
                    System.out.println("Thanks for visit us");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("Select the correct option");
                    break;
            }
        } while (response != 0);
    }

    private static void whileLoop() {
        int i = 1;
        while (turnOnOrTurnOffLight() && i <= 10) {
            printSOS();
            i++;
        }
    }

    private static void forLoop() {
        turnOnOrTurnOffLight();
        for (int i = 1; i <=10 ; i++) {
            printSOS();
        }
    }

    private static void printSOS() {
        System.out.println("... ___ ...");
    }

    private static boolean turnOnOrTurnOffLight() {
        return isTurnOnLight ?  false: true;
    }

}
