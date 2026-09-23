import java.util.Scanner;

public class Discount {
	public static double discount(double price , double discountPrice ) {
		discountPrice = discountPrice / 100;
		double discountAmount = price * discountPrice;
		double finalPrice = price - discountAmount;
		return finalPrice;
	}

	public static double addTax( double price, double taxRate ) {
		taxRate = taxRate / 100;
		double taxPrice = price * taxRate;
		return taxPrice + price;
	}

	public static boolean isexpensive(double price) {
		return price > 50;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(" Enter price: ");
		double price = scanner.nextDouble();
		System.out.print(" Enter discount: ");
		double discount = scanner.nextDouble();
		System.out.print(" Enter taxes: ");
		double tax = scanner.nextDouble();
		System.out.println(addTax(discount(price, discount), tax));
	}
}
