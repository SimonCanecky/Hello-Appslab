package com.appslab;

public class Main {


    public static void main (String[] args)
    {
        System.out.println(isPalindrome("mom"));

    }
    public static boolean isPalindrome(String slovo){
        String reverse = new StringBuffer(slovo).reverse().toString();

        if (slovo.equals(reverse))
            return true;

        else
            return false;
    }
}
