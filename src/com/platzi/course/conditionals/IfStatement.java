package com.platzi.course.conditionals;

public class IfStatement {

    public static void main(String[] args) {
        boolean bluetoothEnabled = true;
        int fileSent = 3;
        if (bluetoothEnabled) {
            //Send file
            fileSent++;
            System.out.println("File Sent");
        } else {
            System.out.println("Please turn on your bluetooth to initialize the transference");
        }
        System.out.println("Files Sent = " + fileSent);
    }
}
