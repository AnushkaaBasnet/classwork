import java.util.Scanner;

public class billing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int a = sc.nextInt();
       

        double total = 0;

        for (int i = 1; i <= a; i++) {
            System.out.print("Enter item name " + i + ": ");
            String item = sc.nextLine();
            System.out.print("Enter quantity  " + item + ": ");
            int itemQuantity = sc.nextInt();
            System.out.print(" The price per item  " + item + ": ");
            double itemPrice = sc.nextDouble();

            double Total = itemQuantity * itemPrice;
            total += Total;


        }

        double vat = total * 0.12;
        double discount = total * 0.10;
        double finalTotalCost = total+ vat - discount;

        System.out.println("Bill");
        System.out.println("Total Cost: cost" + total);
        System.out.println("VAT (12%): cost" + vat);
        System.out.println("Discount (10%): cost" + discount);
        System.out.println("Final Total Cost: cost" + finalTotalCost);


    }
}