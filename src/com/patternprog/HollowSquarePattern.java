package com.patternprog;

import java.util.Scanner;

public class HollowSquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        int size = scanner.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= size; i++) {
            // Inner loop for columns
            for (int j = 1; j <= size; j++) {
                // Print * for first and last rows, and for first and last columns
                // Print space otherwise
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
