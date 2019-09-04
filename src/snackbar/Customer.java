package snackbar;

public class Customer {
    // Fields
    private static int maxId;

    private int id;
    private String name;
    private double cashOnHand;

    // Constructor
    public Customer(String name, double cashOnHand) {
        maxId++;

        id = maxId;

        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    // Methods
    public int getId() {
        return id;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void addCash(int amtToAdd) {
        cashOnHand += amtToAdd;
    }

    public void purchase(int totalCost) {
        cashOnHand -= totalCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}