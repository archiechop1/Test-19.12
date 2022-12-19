package com.company;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        boolean isTrue=true;

        while (isTrue) {
            System.out.println("Please enter the number of month!");
            Scanner scn = new Scanner(System.in);
            int month = scn.nextInt();


            switch (month) {
                case 1:
                    System.out.println("January");
                    isTrue=false;
                    break;
                case 2:
                    System.out.println("February");
                    isTrue=false;
                    break;
                case 3:
                    System.out.println("March");
                    isTrue=false;
                    break;
                case 4:
                    System.out.println("April");
                    isTrue=false;
                    break;
                case 5:
                    System.out.println("May");
                    isTrue=false;
                    break;
                case 6:
                    System.out.println("June");
                    isTrue=false;
                    break;
                case 7:
                    System.out.println("July");
                    isTrue=false;
                    break;
                case 8:
                    System.out.println("August");
                    isTrue=false;
                    break;
                case 9:
                    System.out.println("September");
                    isTrue=false;
                    break;
                case 10:
                    System.out.println("October");
                    isTrue=false;
                    break;
                case 11:
                    System.out.println("November");
                    isTrue=false;
                    break;
                case 12:
                    System.out.println("December");
                    isTrue=false;
                    break;
                default:
                    System.out.println("This month doesn't exist!");
            }

        }
    }
}