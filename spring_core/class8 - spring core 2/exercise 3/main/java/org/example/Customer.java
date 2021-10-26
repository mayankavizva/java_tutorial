package org.example;

public class Customer {
    private int custId;
    private String name;
    private Address address;

    public Customer(int custId, String name, Address address) {
        this.custId = custId;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
