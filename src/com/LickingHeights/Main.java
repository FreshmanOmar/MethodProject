package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declare
        Scanner input;
        //initializing
        input = new Scanner(System.in);
        println();
        System.out.println("What is your name?");
        String name = input.nextLine();
        prints(name);
        multiply(7, 6); }

        public static void println() {
        System.out.println("Hello World");
    }
    public static void prints(String name) {
        //declare
        System.out.println("hello " + name);
    }
    public static int multiply(int A, int B) {
        System.out.println("7x6= " + A * B);
        return A;



}
























