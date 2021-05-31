package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("5 Subjects");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your Marks in English");
        int e = sc.nextInt();
        System.out.println("Enter your Marks in Hindi");
        int h = sc.nextInt();
        System.out.println("Enter your Marks in Maths");
        int m = sc.nextInt();
        System.out.println("Enter your Marks in Physics");
        int p = sc.nextInt();
        System.out.println("Enter your Marks in Chemistry");
        int c = sc.nextInt();
        float Total = e + h + m + p + c;
        float percentage = Total / 500 * 100f;
        System.out.println("the percentage is");
        System.out.println(percentage);
    }
}