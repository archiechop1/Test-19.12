package com.company;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        currency();
    }

    public static float currency(){
        float euro, dollar;
        System.out.println("Please enter an amount of money in euro: ");
        Scanner scn = new Scanner(System.in);
        euro = scn.nextFloat();
        dollar = euro * 1.06f; //the exchange rate as of 19th December 2022
        float result = dollar;
        System.out.println("The amount of money in dollars is " + result + " $.");
        return result;
    }
}
