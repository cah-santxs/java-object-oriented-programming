package entities;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;

	public static double currencyConverter(double dollarPrice, double dollarBought) {
		return ((dollarPrice * dollarBought) * IOF) + (dollarPrice * dollarBought);
	}

}
