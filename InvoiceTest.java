class Inovice{
private String partDiscirption;
private String partNumber;
private int quantity;
private double pricePerItem;
public Inovice(String partDiscirption, String partNumber, int quantity, double pricePerItem) {
    if (pricePerItem>0.0) {
        this.pricePerItem = pricePerItem;
    }
    if (quantity>0) {
        this.quantity = quantity;
    }
    this.partDiscirption = partDiscirption;
    this.partNumber = partNumber;
    
   
}
public String getPartDiscirption() {
    return partDiscirption;
}
public void setPartDiscirption(String partDiscirption) {
    this.partDiscirption = partDiscirption;
}
public String getPartNumber() {
    return partNumber;
}
public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
}
public int getQuintity() {
    return quantity;
}
public void setQuintity(int quintity) {
    if (quantity>0) {
        this.quantity = quantity+quantity;
    }
    
}
public double getPricePerItem() {
    return pricePerItem;
}
public void setPricePerItem(double pricePerItem) {
    if (pricePerItem>0.0) {
        this.pricePerItem = pricePerItem+pricePerItem;
    }
}
public double getInvoicAmount(){
    double amount=quantity*pricePerItem;
    if (quantity<0) {
        return 0;
    }
    else if (pricePerItem<0.0) {
        return 0.0;
    }
    else 
        return amount;

}
}
public class InvoiceTest {
    public static void main(String[] args) {
        
    
        Inovice in=new Inovice("Abuuuu", "22334", 100, 100);
        System.out.println("Part Description: "+in.getPartDiscirption());
        System.out.println("Part Number: "+in.getPartNumber());
        System.out.println("Quintity: "+in.getQuintity());
        System.out.println("Price per Item: "+in.getPricePerItem());
        System.out.println("Invoice Amount: "+in.getInvoicAmount());
        System.out.println("----------------------------------------------");
        in.setQuintity(-100);
        in.setPricePerItem(-100);
        System.out.println("Update Quintity: "+in.getQuintity());
        System.out.println("Update Price per Item: "+in.getPricePerItem());
        System.out.println("Invoice Amount: "+in.getInvoicAmount());
    }
}
