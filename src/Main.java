package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();

        int rand_a = rand.nextInt(4);         //trochu zložitejšie cez random
        int rand_b = rand.nextInt(4);
        int rand_c = rand.nextInt(4);

        System.out.println("Random cislo a: " + rand_a);
        System.out.println("Random cislo b: " + rand_b);
        System.out.println("Random cislo c: " + rand_c);


        if (rand_a == rand_b) {
            if (rand_a == rand_c) {
                System.out.println("Rovnake su: 3");
            } else if (rand_b != rand_c) {
                System.out.println("Rovnake su: 2");
            }
        }

        else if (rand_b == rand_c) {
            if (rand_a != rand_c) {
                System.out.println("Rovnake su: 2");
            }
        }
        else if (rand_a == rand_c) {
            if (rand_b != rand_c) {
                System.out.println("Rovnake su: 2");
            }
        }
        else {
            System.out.println("Rovnake su: 0");

        }
    }
}