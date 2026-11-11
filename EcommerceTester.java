public class EcommerceTester{
    public static void main(String[] args){
        Customer c1 = new Customer("Alice", "Smith", 101);
        ShoppingCart s1 = new ShoppingCart(c1);
        Product p1 = new Product("Laptop", 999.99);
        Product p2 = new Product("Mouse", 25.50);
        Product p3 = new Product("Keyboard", 45.00);
        s1.add(p1);
        s1.add(p2);
        s1.add(p3);

        Customer c2 = new Customer("Bob", "Jones", 102);
        ShoppingCart s2 = new ShoppingCart(c2);
        Product p4 = new Product("Desk", 150.00);
        Product p5 = new Product("Chair", 85.00);
        s2.add(p4);
        s2.add(p5);

        Checkout c = new Checkout(s1, s2, "Online Store US");
        c.display();
    }
}