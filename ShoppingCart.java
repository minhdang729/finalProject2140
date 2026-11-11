import java.util.*;
public class ShoppingCart {
    private Customer owner;
    private ArrayList<Product> items;

    public ShoppingCart(Customer owner){
        this.owner = owner;
        this.items = new ArrayList<Product>();
    }

    public void add(Product p) {this.items.add(p);}
    public double getTotalCost(){
        double sum=0;
        for(Product i : items)
            sum += i.getPriceWithTax();
        return sum;
    }
    public double getAvgItemPrice(){
        return Math.round(getTotalCost()/items.size()*100.0)/100.0;
    }
    public Product getMostExpensiveItem(){
        Product temp = items.get(0);
        double price = items.get(0).getBasePrice();

        for (Product i : items){
            if (i.getBasePrice() > price){
                temp = i;
                price = i.getBasePrice();
            }
        }
        return temp;
    }

    public Product getCheapesProduct(){
        Product temp = items.get(0);
        double price = items.get(0).getBasePrice();

        for (Product i : items){
            if (i.getBasePrice() < price){
                temp = i;
                price = i.getBasePrice();
            }
        }
        return temp;
    }

    public void display(){
        System.out.printf("Cart Owner: %s (Acct: %d)\n",owner.getFullName(), owner.getAccountID());
        for (Product i : items){
           System.out.printf(i.toString());
           System.out.println();
    }
        System.out.printf("Total Items: %d\n",items.size());
        System.out.printf("Total Cost: $%.2f\n",getTotalCost());
        System.out.printf("Avg Item Price: $%.2f\n",getAvgItemPrice());
        System.out.printf("Most Expensive: %s\n",getMostExpensiveItem().getName());
        System.out.printf("Cheapest: %s\n",getCheapesProduct().getName());
        System.out.println("-------------");
        System.out.println();
    }
}