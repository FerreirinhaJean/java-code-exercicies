package applicantion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Product> lista = new ArrayList<>();

		System.out.print("Enter the number of products:");
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char tag = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (tag == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				lista.add(new ImportedProduct(name, price, customsFee));
			}
			if (tag == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY):");
				sc.nextLine();
				Date manufactureDate = sdf.parse(sc.next());
				lista.add(new UsedProduct(name, price, manufactureDate));
			} if(tag=='c') {
				lista.add(new Product(name, price));
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).priceTag());
		}

		sc.close();

	}

}
