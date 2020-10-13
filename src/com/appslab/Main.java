package com.appslab;

public class Main {

    public static void main(String[] args) {
        int[] list = {10, 4, 1, 4, -10, -50, 32, 21};

        int max = getMax(list);
        System.out.println("Maximum Value is: "+max);

        int min = getMin(list);
        System.out.println("Minimum Value is: "+min);

        int vysledok = max - min;
        System.out.println("Difference between the biggest and smallest numbers is: "+vysledok);
    }

    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}
