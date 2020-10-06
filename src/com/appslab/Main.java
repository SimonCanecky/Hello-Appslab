package com.appslab;

public class Main {

    public static void main(String[] args) {
        Person John = new Person("John", 21, 23000);
        Person Steve = new Person("Steve", 32, 40000);
        Person Martin = new Person("Martin", 16, 2700);

        int sum;
        sum = John.personRozpocet + Steve.personRozpocet + Martin.personRozpocet;

        System.out.println(sum);
    }
}
