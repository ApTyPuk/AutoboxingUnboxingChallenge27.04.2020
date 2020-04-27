package com.Artur;

import java.util.ArrayList;

public class Customers extends Branches {

    private String name;
    private ArrayList<Double> transactions; //list of customers transactions. Track a transaction each customer made

    public Customers(String branchName, String name) {
        super(branchName);
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }
}
