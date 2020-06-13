package com.Vlad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        while (true) {
            boolean flag = scanner.hasNextInt();
            if (flag) {
                int num = scanner.nextInt();
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
                System.out.println("Enter next number (or 'f' to finish)");
            } else {
                scanner.nextLine();
                break;
            }
        }
        System.out.println("The smallest number entered was " + min + " and the largest was " + max);
    }
}
