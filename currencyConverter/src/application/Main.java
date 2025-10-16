package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.printf("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.printf("How many dollars will be bought?");
		double dollarBought = sc.nextDouble();
		System.out.printf("Amount to be paid in reais: ");
		double amountToPay = CurrencyConverter.currencyConverter(dollarPrice, dollarBought);
		System.out.printf("R$ %.2f", amountToPay);
		
		
		sc.close();

	}

}
