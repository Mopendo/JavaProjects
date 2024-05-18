package Chapter3;

public class Invoice {
    private String partNumber; // instance variable
    private String partDescription; // instance variable
    private int quantity;
    private double pricePerItem;

    //Account constructor that receives two parameters
    public Invoice () {
        partNumber = "None";
        partDescription = "None";
        quantity = 0;
        pricePerItem = 0.0;
    }


    // accessor methods
    public String getPartNumber()
    {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }
    //method that sets the instance variables
    public void setPartNumber (String partNumber){  // method that sets the name
        this.partNumber = partNumber;
    }
    public void setPartDescription (String partDescription) {
        this.partDescription = partDescription;
    }
    public void setQuantity (int quantity) {
        this.quantity = quantity;
    }
    public void setPricePerItem (double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    //calculate and return the invoice amount
    public double getInvoiceAmount() {
        return quantity * pricePerItem; // calculates the invoice amount
    }
}
