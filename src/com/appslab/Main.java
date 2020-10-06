package com.appslab;

public class Main {

    public static void main(String[] args) {
        Student John = new Student( 2, 123456, "Legionárska 1, 01001 Žilina" );
        Student Sam = new Student( 5, 456789, "Legionárska 2, 01001 Žilina" );

        System.out.println( John.studentNumber + ", " + John.studentPhone + ", " + John.Address);
        System.out.println( Sam.studentNumber + ", " + Sam.studentPhone + ", " + Sam.Address);


    }
}


