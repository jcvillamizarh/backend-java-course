package com.platzi.course.variables;

public class CastingVariablesExercise {

    public static void main(String[] args) {
        //1.
        char c = 'z';
        //convert this char to int
        int convertChar = c; // in this case the casting is implicit
        //2.
        int i = 250; //convert this to long and then long to short
        long convertInt = i; //this is implicit
        short convertLong = (short) convertInt;
        System.out.println(convertLong);
        //3.
        double d = 301.067; //convert to long
        long convertDouble = (long)d; //it will lose precision
        System.out.println(convertDouble);
        //4.
        int n = 100; //add 5000.6 and convert to float
        float convertIntToFloat = n + 5000.6F;
        int n2 = 737;// multiply by 100 and convert to byte
        n2 *= 100;
        byte bt = (byte) n2;
        //5.
        double d2 = 298.638;// divide in 25 and convert to long
        d2 /= 25;
        long ld = (long)d2;
        System.out.println(ld);
    }
}
