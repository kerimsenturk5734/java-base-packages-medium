package ObjectExamples;

public class Product implements Cloneable{
    private String name;
    private double price;

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }
    public String getName() {return name;}
    public double getPrice() {return price;}
    public void setName(String name) {this.name = name;}
    public void setPrice(double price) {this.price = price;}

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }

    @Override
    protected Product clone() throws CloneNotSupportedException
    {
        return (Product) super.clone();
    }

}
