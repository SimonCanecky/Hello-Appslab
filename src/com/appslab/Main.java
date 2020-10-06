package com.appslab;

public class Main {

    public static void main(String[] args) {

        System.out.println(equalSlices(11, 5,2));
        System.out.println("(11, 5, 2)");
    }
    public static boolean equalSlices(int totalSlices, int noRecipients, int slicesEach) {
        return noRecipients * slicesEach <= totalSlices;
    }

}
