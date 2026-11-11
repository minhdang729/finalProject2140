public class Customer {
    private String firstName, lastName;
    private int accountID;

    public Customer(String firstName, String lastName, int accountID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
    }
    public Customer(){
        this("N/A","N/A", 0);
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }
    public int getAccountID(){
        return accountID;
    }
    @Override 
    public String toString(){
        return getFullName() + ", Account ID: " + getAccountID();
    }
}