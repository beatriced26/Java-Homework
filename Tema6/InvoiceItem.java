package Tema6;

public class InvoiceItem {

    private int id;
    private String description;
    private int quantity;
    private int unitPrice;


    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void getTotal (int quantity, int unitPrice) {
        if (quantity > 0) {
            int totalPrice = quantity * unitPrice;
            System.out.println("Total price for " + quantity + " items with id " + id + " is: " + totalPrice );
        }
    }
}
