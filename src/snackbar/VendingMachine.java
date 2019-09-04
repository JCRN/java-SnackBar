package snackbar;

public class VendingMachine {
    // Fields
    private static int maxId;
    private int id;
    private String name;

    // Constructor
    public VendingMachine(String name) {
        maxId++;

        id = maxId;

        this.name = name;
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
}