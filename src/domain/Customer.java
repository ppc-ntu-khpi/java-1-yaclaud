package domain;

public class Customer {
    public void setID(int ID) {
        if (ID >0) {
            this.ID = ID;
        }
    }

    private int ID = 1;

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    private boolean isNew = true;

    public void setTotal(double total) {
        if (ID >0) {
            this.ID = ID;
        }
    }

    private double total = 1000.0;

    public Customer() {
        ID = 1;
        isNew = true;
        total = 1000.0;
    }

    public void displayCustomerInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Is new: " + isNew);
        System.out.println("Total purchases: " + total);
    }
}