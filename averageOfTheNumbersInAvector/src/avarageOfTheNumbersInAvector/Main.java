package avarageOfTheNumbersInAvector;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers will you type: ");
		int n = sc.nextInt();
		
		double vect[] = new double[n];
		
		double sum = 0;
		for (int i=0; i<vect.length;i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		System.out.print("\nValues: ");

		for (int i=0;i<vect.length;i++) {
			System.out.print(vect[i] + " ");
			}
		
		System.out.printf("\nSum: %.2f", sum);
		
		double avarage = sum / n;
		System.out.printf("\nAvarage: %.2f", avarage);
		
		sc.close();
		}


}
