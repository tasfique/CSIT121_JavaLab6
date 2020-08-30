//Student's Full Name- Tasfique Enam
//Student's ID- J16020825/5886429
//Modification Date 17/06/2019
package labtask6;

public class Invoice {
    int partNumber;
    String description;
    String type;
    int quantity;
    double price;
    
    public Invoice(int partNumber, String description, String type, int quantity, double price) {
        this.partNumber = partNumber;
        this.description = description;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Invoice{" + "partNumber=" + partNumber + ", description=" + description + ", type=" + type + ", quantity=" + quantity + ", price=" + price + '}';
    }
    
    
    
    
}
