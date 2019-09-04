package snackbar;

public class Snack {
    // Fields
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendId;

    // Constructor
    public Snack(String name, int quantity, double cost, int vendId) {
        maxId++;

        this.id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendId = vendId;
    }

    // Methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getVendId() {
        return vendId;
    }

    public void setVendId(int vendId) {
        this.vendId = vendId;
    }

    public void restock(int addQuantity) {
        quantity += addQuantity;
    }

    public void purchase(int subtractQuantity) {
        quantity -= subtractQuantity;

    }

    public void totalCost(int givenQuantity) {
        cost *= givenQuantity;
    }
}