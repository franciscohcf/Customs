package entities;

import java.util.Date;

public class UsedProduct extends Product{

    protected Date manufactureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    @Override
    public String priceTag() {
        return super.getName() + " (used) " + " $ " + super.getPrice() + "(Manufacture date: " + " $ " + this.getManufactureDate() + ")";
    }
}
