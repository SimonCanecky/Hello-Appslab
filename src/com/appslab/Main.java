package com.appslab;

public class Main {

    public static void main(String[] args) {

        int[] cisla = {2, 3, 1, 0,};
        cisla = multipleByLenght(cisla);
        for (int number : cisla) {
            System.out.println(number);
        }
    }

    public static int[] multipleByLenght(int[] cisla) {
        for (int number = 0; number < cisla.length; number++) {
            cisla[number] = cisla[number] * cisla.length;
        }
        return cisla;
    }
}
