package test;

import domain.Customer;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.displayCustomerInfo();
        customer.setID(222);
        customer.setNew(true);
        customer.setTotal(10);
    }
}