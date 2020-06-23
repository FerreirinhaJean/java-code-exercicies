package Converter;

public class CurrencyConverter {
	public static final double IOF = 0.06;

	public static double Conversor(double dolar, double qnt) {
		return (dolar*qnt) + (dolar*qnt)*IOF;
				}
}
