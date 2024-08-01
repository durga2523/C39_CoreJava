package com.durga.assignment2;
import java.util.Scanner;
public class Circle {
	private double radius;
	private String color;

	public void getInput() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the radius of the circle: ");
		radius = sc.nextDouble();
		sc.nextLine();

		System.out.print("Enter the color of the circle: ");
		color = sc.nextLine();
		sc.close();
	}

	public void calcArea() {
		double area = 3.14 * radius * radius;
		System.out.println("The area of the circle is: " + area);
	
		}

	public static void main(String[] args) {

		Circle circle = new Circle();

		circle.getInput();

		circle.calcArea();
		
	}
}
