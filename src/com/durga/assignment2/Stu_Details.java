package com.durga.assignment2;

import java.util.Scanner;

public class Stu_Details {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	
		System.out.print("Enter your name: ");
		String Name = sc.nextLine();

		System.out.print("Enter your register number: ");
		String regNumber = sc.nextLine();

		System.out.print("Enter your grade: ");
		String grade = sc.nextLine();

		System.out.print("Enter your percentage: ");
		String percentage = sc.nextLine();

	
		System.out.println();
		System.out.println(Name);
		System.out.println(regNumber);
		System.out.println(grade);
		System.out.println(percentage);

		sc.close();
	}
}
