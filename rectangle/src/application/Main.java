package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and high: ");
		rectangle.width = sc.nextDouble();
		rectangle.high = sc.nextDouble();
		
		System.out.printf("Area: %.2f%n", rectangle.area());
		System.out.printf("Perimeter: %.2f%n", rectangle.perimeter());
		System.out.printf("Diagonal: %.2f", rectangle.diagonal());
		
		sc.close();

	}

}
