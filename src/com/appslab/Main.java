package com.appslab;

public class Main {

    public static void main(String[] args) {

        double height = 0.3;
        double length = 0.2;
        double tower = 25.0;
        double totalDistance = (tower / height) * (height + length);
        System.out.println(totalDistance);
    }
}
