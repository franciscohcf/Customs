package aplication;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class App {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list = new ArrayList<>();

        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.println("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            if (ch == 'c') {
                System.out.println("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Price: ");
                double price = sc.nextDouble();
                list.add(new Product(name, price));
            }
            if (ch == 'u') {
                System.out.println("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Price: ");
                double price = sc.nextDouble();
                System.out.println("Manufacture date (DD/MM/YYYY)");
                Date manufactureDate = sdf.parse(sc.next());
                list.add(new UsedProduct(name, price,manufactureDate));
            }
            if (ch == 'i') {
                System.out.println("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Price: ");
                double price = sc.nextDouble();
                System.out.println("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price,customsFee));
            }
        }
        System.out.println();

        System.out.println("PRICE TAGS");

        for (Product p:list) {
            System.out.println(p.priceTag());;
        }

        sc.close();
    }
}
