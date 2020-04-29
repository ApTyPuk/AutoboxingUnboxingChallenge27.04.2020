package com.Artur;

import java.util.ArrayList;

public class Branches extends Bank {
    private String branchName;
    private ArrayList<Customers> branchCustomers;

    public Branches(String branchName) {
        this.branchName = branchName;
        this.branchCustomers = new ArrayList<Customers>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customers> getBranchCustomers() {
        return branchCustomers;
    }

    private static Branches addBranch(String branchName){   // Customers are attached to the branch. Transactions attached to customer
        return new Branches(branchName);
    }

    private void addCustomerToCertainBranch(Branches branchName, String customerName, Double transaction){ //+initial a transaction same time
        Customers.createCustomer(branchName.getBranchName(), customerName);
        Customers.addTransaction();

        branchName.getBranchCustomers().create;


    }

    private void newTransactionForExistingCustomer(){ //unlimited time of transactions

    }

    public void showListOfCustomersForCertainBranch(){  //+list of their transactions

    }

}
