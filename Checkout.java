public class Checkout {
    private ShoppingCart cart1, cart2;
    private String storeLocation;

    public Checkout(ShoppingCart c1, ShoppingCart c2, String location){
        this.cart1 = c1;
        this.cart2 = c2;
        this.storeLocation = location;
    }
    public void display(){
        System.out.println("=== Checkout Event ===");
        System.out.printf("Store: %s\n", this.storeLocation);
        System.out.println();
        System.out.println("--- Order 1 ---");
        cart1.display();
        System.out.println("--- Order 2 ---");
        cart2.display();
    }
}