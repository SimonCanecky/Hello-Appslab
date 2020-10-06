package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();                 //znovu urobeni program cez random

        int rand_a = rand.nextInt(10);
        int rand_b = rand.nextInt(10);
        int rand_c = rand.nextInt(10);


        if (rand_a + rand_b > rand_c && rand_a + rand_c > rand_b && rand_b + rand_c > rand_a){
            System.out.println("Hodnoty: " + rand_a + ", " + rand_b + ", " + rand_c);
            System.out.println("Trojuhlonik: true");
        }
        else{
            System.out.println("Hodnoty: " + rand_a + ", " + rand_b + ", " + rand_c);
            System.out.println("Trojuhlonik: false");
        }

    }
}