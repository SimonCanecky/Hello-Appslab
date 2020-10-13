package com.appslab;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner hrac1 = new Scanner(System.in);
        Scanner hrac2 = new Scanner(System.in);

        System.out.println("Options:");
        System.out.println("         1 = Scissors");
        System.out.println("         2 = Rock");
        System.out.println("         3 = Paper");
        System.out.println("");

        System.out.print("Player 1 parameter: ");
        int parameter1 = hrac1.nextInt();
        System.out.print("Player 2 parameter: ");
        int parameter2 = hrac2.nextInt();

        if (parameter1 == 1){
            if (parameter2 == 2)
                System.out.println("Player 2 wins");
            else if (parameter2 == 3)
                System.out.println("Player 1 wins");
            else if (parameter2 == 1)
                System.out.println("TIE");
            else
                System.out.println("Wrong parameter");
        }
        else if (parameter1 == 2){
            if (parameter2 == 2)
                System.out.println("TIE");
            else if (parameter2 == 3)
                System.out.println("Player 2 wins");
            else if (parameter2 == 1)
                System.out.println("Player 1 wins");
            else
                System.out.println("Wrong parameter");
        }
        else if (parameter1 == 3){
            if (parameter2 == 2)
                System.out.println("Player 1 wins");
            else if (parameter2 == 3)
                System.out.println("TIE");
            else if (parameter2 == 1)
                System.out.println("Player 2 wins");
            else
                System.out.println("Wrong parameter");
        }
        else {
            System.out.println("Wrong parameter");
        }
    }
}
