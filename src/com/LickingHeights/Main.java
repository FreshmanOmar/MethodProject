package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declare
        Scanner input;
        //initializing
        input = new Scanner(System.in);
        String Two = "can";
        String one = "we";
        println();
        System.out.println("What is your name?");
        String name = input.nextLine();
        prints(name);
        multiply(7, 6);
        Divide(18, 23);
       System.out.println( "\nThe Bigger Number Is "+Biggest(31.83357, 3.12314));
       System.out.println(reverse("we","can"));

}

    public static void println() {
        System.out.println("Hello World");
    }

    public static void prints(String name) {
        //declare
        System.out.println("hello " + name);
    }

    public static int multiply(int A, int B) {
        System.out.println("7x6= " + A * B);
        return B;
    }

    public static double Divide(double a, double b) {
        System.out.print("18/23= " + a / b);
        return a;
    }

    public static double Biggest(double a, double b) {
        {    if (a > b && b != a) {
                return a;
                } else if(b > a && a != b) {
                return b;
            }else if(b == a){return 0;
            }
        }


        return a;
    }
    public static String reverse(String Two, String One){
        System.out.println(One);return Two;



        }


}









































