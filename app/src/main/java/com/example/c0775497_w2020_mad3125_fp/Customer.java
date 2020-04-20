package com.example.c0775497_w2020_mad3125_fp;

import android.os.Parcel;

import java.util.BitSet;
import java.util.HashMap;

public class Customer {

    private String customerId;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String userName;
    private String password;
    private String address;
    private String birthDate;
    private Double fullTotal;
    private int customerImage;
    private HashMap<String, Bill> customerBills=new HashMap<String, Bill>();

    protected Customer(Parcel in){
        customerId= in.readString();
        firstName= in.readString();
        lastName= in.readString();
        gender= in.readString();
        email= in.readString();
        userName= in.readString();
        password= in.readString();
        address= in.readString();
        fullTotal= in.readDouble();
        birthDate= in.readString();
        customerImage=in.readInt();
        customerBills=in.readHashMap(Bill.class.getClassLoader());
    }
}
