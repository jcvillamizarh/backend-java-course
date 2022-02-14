package com.platzi.course.arrays;

public class ArrayExample {
    public static void main(String[] args) {

        int x = 1;
        while (x <= 10) {
            System.out.println(++x);
        }

        int jk = 7; char c = 'w'; System.out.println((jk >= 6) && (c == 'w'));

        //byte i = 1; byte j = 1; byte k = i+j;


        String[] androidVersions = new String[17];
        String days[] = new String[7];
        String[][] cities = new String[4][2];
        int[][][] numbers = new int[2][2][2];
        int[][][][] numbers4 = new int[2][2][2][2];

        androidVersions[0] = "Apple pie";
        androidVersions[1] = "Banana Bread";
        androidVersions[2] = "CupCake";
        androidVersions[3] = "Donut";

        System.out.println(androidVersions[2]);

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotá";
        cities[2][0] = "Mexico";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Mexico";
        cities[3][1] = "CDMX";

        //changuito

        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";

        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

        for (int row = 0; row < cities.length; row++) {
            for (int column = 0; column < cities[row].length; column++) {
                System.out.println(cities[row][column]);
            }
        }

        for (String[] pair: cities) {
            for (String name: pair) {
                System.out.println(name);
            }
        }

    }
}
