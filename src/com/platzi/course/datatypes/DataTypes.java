package com.platzi.course.datatypes;

public class DataTypes {
    public static void main(String[] args) {
        //After Java 10, it is not required to put the type of variable, just use the key word var.
        /*
            Number data types: byte, short, int, long
            byte: rang -128 to 127 1 byte
            short: -32768 to 32767 2 bytes
            int: -2147483648 to 2147483647 4 bytes
            long: -92233720365808 to 92233720365807 8 bytes, it is declared with a "L" at the end of the number example: 1225L

            Float point: float, double
            float: 4 bytes, it is declared with a "F" at the end of the number, example: 12345.56F;
            double: 8 bytes
        */
        byte nByte = 12;
        System.out.println("Byte: " + nByte);
        short nShort = 123;
        System.out.println("Short: " + nShort);
        int num = 123546;
        System.out.println("Int: " + num);
        long nLong = 1234L;
        System.out.println("Long: " + nLong);
        float nFloat = 124.25F;
        System.out.println("Float" + nFloat);
        double nDouble = 126487.456789;
        System.out.println("Double: " + nDouble);

        /*
            Text data types: Char, boolean, String
            Char: unicode value, just one value, 2 bytes. it is initialized with ''
            boolean: Logic values, true or false, 2 bytes.
            String:
         */
        char nChar = 'C';
        System.out.println("Char: " + nChar);
        boolean nBoolean = true;
        System.out.println("Boolean: " + nBoolean);
        String nString = "hi Java";
        System.out.println("String: " + nString);
        var nVar = "this is a variable";
        System.out.println("Var: " + nVar);
    }
}
