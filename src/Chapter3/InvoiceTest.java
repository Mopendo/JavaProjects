package Chapter3;
import java.util.Scanner;
public class InvoiceTest {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        String partNumber;
        String partDescription;
        int quantity;
        double pricePerItem;
// create two invoice objects
        Invoice invoice1 = new Invoice();
        Invoice invoice2 = new Invoice();

        //get invoice1 details from user
        System.out.println("Invoice 1");
        System.out.print("Enter the part number:  ");
        partNumber = input.nextLine();

        System.out.print("Enter the part description:  ");
        partDescription = input.nextLine();

        System.out.print("Enter the quantity:  ");
        quantity = input.nextInt();

        System.out.print("Enter the price:  ");
        pricePerItem = input.nextDouble();

        //add invoice1 data
        invoice1.setPartNumber(partNumber);
        invoice1.setPartDescription(partDescription);
        invoice1.setQuantity(quantity);
        invoice1.setPricePerItem(pricePerItem);

        // get invoice2 details from user
        System.out.println("Invoice 2");
        System.out.print("Enter the part number:  ");
        input.nextLine();
        partNumber = input.nextLine();

        System.out.print("Enter the part description:  ");
        partDescription = input.nextLine();

        System.out.print("Enter the quantity:  ");
        quantity = input.nextInt();

        System.out.print("Enter the price:  ");
        pricePerItem = input.nextDouble();

        //add invoice2 data
        invoice2.setPartNumber(partNumber);
        invoice2.setPartDescription(partDescription);
        invoice2.setQuantity(quantity);
        invoice2.setPricePerItem(pricePerItem);

        //display invoice1 data
        System.out.println("Invoice 1 information");
        System.out.println("Part number: " + invoice1.getPartNumber());
        System.out.println("Description: " + invoice1.getPartDescription());
        System.out.println("Quantity: " + invoice1.getQuantity());
        System.out.println("Price: $" + invoice1.getPricePerItem());
        System.out.printf("Invoice amount: $%.2f", invoice1.getInvoiceAmount());
        System.out.println();
        System.out.println(".........................................");
        System.out.println();

        //display invoice2 data
        System.out.println("Invoice 2 information");
        System.out.println("Part number: " + invoice2.getPartNumber());
        System.out.println("Description: " + invoice2.getPartDescription());
        System.out.println("Quantity: " + invoice2.getQuantity());
        System.out.println("Price: $" + invoice2.getPricePerItem());
        System.out.printf("Invoice amount: $%.2f", invoice2.getInvoiceAmount());
        System.out.println();
    }
}
