public class Product {
    private String name;
    private double basePrice;
    private int sku;
    private static int numProducts=0;

    public Product(String name, double basePrice){
        this.name = name;
        this.basePrice = basePrice;
        this.sku=1000+numProducts;
        Product.numProducts++;
    }
    public Product(){
        this.name= null;
        this.basePrice=0;
    }
    public String getName(){return this.name;}
    public double getBasePrice(){return this.basePrice;}
    public static int getNumProducts(){return numProducts; }
    public double getPriceWithTax(){
        return Math.round(this.basePrice*1.08*100.00)/100.00;
    };
    @Override 
    public String toString(){
        return String.format("%s (SKU: %d) - Base: $%.2f, w/Tax: $%.2f", getName(), this.sku,getBasePrice(),getPriceWithTax() );
        //return getName() + "(SKU: " + this.sku + ") - Base: $" + getBasePrice() + ", w/Tax: $" + getPriceWithTax();
    }
    @Override 
    public boolean equals(Object obj){
        if (obj instanceof Product){
            Product otherProduct = (Product)obj;
            return (this.sku == otherProduct.sku);
        }
        return false;
    }
}