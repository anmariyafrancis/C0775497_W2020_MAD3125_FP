package com.example.c0775497_w2020_mad3125_fp;

import java.util.HashMap;

public class DataSingelton {
    private static DataSingelton repoObj=new DataSingelton();
    public static DataSingelton getInstance(){return repoObj;}
    private DataSingelton(){}
    private HashMap<String,Customer>customerMap=new HashMap<>();
    public HashMap getCustomerMap(){return this.customerMap;}
    public void populateData(){
        Customer c1=new Customer();
    }
}
