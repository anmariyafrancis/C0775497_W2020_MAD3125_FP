package com.example.c0775497_w2020_mad3125_fp;

import com.example.c0775497_w2020_mad3125_fp.model.Bill;
import com.example.c0775497_w2020_mad3125_fp.model.Customer;
import com.example.c0775497_w2020_mad3125_fp.model.Hydro;
import com.example.c0775497_w2020_mad3125_fp.model.Internet;
import com.example.c0775497_w2020_mad3125_fp.model.Mobile;

import java.util.HashMap;

public class DataSingleton {
    private static DataSingleton repoObj = new DataSingleton();
    public static DataSingleton getInstance() {
        return repoObj;
    }
    private DataSingleton() { }
    private HashMap<String, Customer> customerMap = new HashMap<>();

    public HashMap getCustomerMap(){
        return this.customerMap;
    }
    public void populateData()
    {
        Customer c1 = new Customer("01","Anmariya","Francis",
                "Female","anmariya@gmail.com","an","an123","Scarborough",
                "12/04/1996",R.drawable.woman);
        Customer c2 = new Customer("02","Aldin","Jose",
                "Male","aldin@gmail.com","al","al123","India",
                "06/12/1995",R.drawable.young);
        Mobile m1 = new Mobile("M1",
                "1/11/2020",
                Bill.BillType.Mobile,
                "HUAWEI INC.",
                "Unli Call All Day",
                "8636781990",
                21,
                50);
        Hydro h1 = new Hydro( "H1",
                "5/19/2019",
                Bill.BillType.Hydro,
                "Waters",
                9);
        Internet in1 = new Internet("I1",
                "8/23/2020",
                Bill.BillType.Internet,
                "Fido",
                19.4);
       /* c2.addBill("I1", in1);
        c1.addBill("M1", m1);
        c1.addBill("H1", h1);*/
        customerMap.put(c1.getCustomerId(),c1);
        customerMap.put(c2.getCustomerId(),c2);

    }
}
