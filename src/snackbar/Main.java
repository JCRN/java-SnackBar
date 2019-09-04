package snackbar;

public class Main {

    public static void workWithData() {
        // Instantiate Customers
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        // Instantiate Vending Machines
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        // Instantiate Snacks for
        // Vending Machine Food:
        Snack chips = new Snack("Chips", 36, 1.75, food.id());
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.id());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.id());
        // Vending Machine Drink:
        Snack soda = new Snack("Soda", 24, 2.50, drink.id());
        Snack water = new Snack("Water", 20, 2.75, drink.id());

    }

    public static void main(String[] args) {

    }
}