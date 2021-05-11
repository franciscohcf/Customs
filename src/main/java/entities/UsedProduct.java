package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

    protected Date manufactureDate;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

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
        return super.getName() + " (used) " + " $ " + super.getPrice() + "(Manufacture date: " + " $ " + sdf.format(manufactureDate) + ")";
    }
}
