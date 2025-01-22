package com.startup.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer extends User{
    private String preferredPaymentMethod;

    //Constructors
    public Customer(){}

    public Customer(String username, String password, Role role, String email, String phone, String preferredPaymentMethod) {
        super(username, password, role, email, phone);
        this.preferredPaymentMethod = preferredPaymentMethod;
    }

    public String getPreferredPaymentMethod() {
        return preferredPaymentMethod;
    }

    public void setPreferredPaymentMethod(String preferredPaymentMethod) {
        this.preferredPaymentMethod = preferredPaymentMethod;
    }

    //Override toString of Parent class
    @Override
    public String toString(){
        return "Customer{"  +
                "preferredPaymentMethod='" + preferredPaymentMethod + '\'' +
                "} " + super.toString();
    }
}
