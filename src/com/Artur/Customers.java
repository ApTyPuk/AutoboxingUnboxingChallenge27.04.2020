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

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public static Customers createCustomer(String branchName, String name){
        return new Customers(branchName, name);
    }

    public static void addTransaction(Customers customer, Double transaction){
        customer.getTransactions().add(transaction);
    }

    public void printTransactions(Customers customer){
        for(int i = 0; i < customer.getTransactions().size(); i++){
            System.out.println("#"+(i+1)+" transaction -> " +
                    customer.getTransactions().get(i));
        }
    }


}
