package com.Artur;

import java.util.ArrayList;

public class Branches extends Bank {
    private String branchName;
    private ArrayList<Customers> branchCustomers;

    public Branches(String branchName) {
        this.branchName = branchName;
        this.branchCustomers = new ArrayList<Customers>();
    }

    private void addBranch(){ // Customers are attached to the branch. Transactions attached to customer

    }

    private void addCustomerToCertainBranch(){ //+initial a transaction same time

    }

    private void newTransactionForExistingCustomer(){ //unlimited time of transactions

    }

    public void showListOfCustomersForCertainBranch(){  //+list of their transactions

    }

}
