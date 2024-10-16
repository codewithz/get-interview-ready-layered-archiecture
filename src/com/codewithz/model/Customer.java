package com.codewithz.model;

import java.time.LocalDate;

public class Customer {

    private int id;

    private String name;

    private String email;

    private String phone;

    private LocalDate dateOfJoin;

    private String accountType;


    public Customer() {
    }

    public Customer(int id, String name, String email, String phone, LocalDate dateOfJoin, String accountType) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dateOfJoin = dateOfJoin;
        this.accountType = accountType;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getDateOfJoin() {
        return dateOfJoin;
    }

    public void setDateOfJoin(LocalDate dateOfJoin) {
        this.dateOfJoin = dateOfJoin;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", dateOfJoin=" + dateOfJoin +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
