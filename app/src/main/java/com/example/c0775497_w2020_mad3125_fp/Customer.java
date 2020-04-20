package com.example.c0775497_w2020_mad3125_fp;

import android.os.Parcel;
import android.os.Parcelable;

import java.security.PublicKey;
import java.util.BitSet;
import java.util.HashMap;

public class Customer implements Parcelable {

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
    private HashMap<String, Bill> customerBills = new HashMap<String, Bill>();

    protected Customer(Parcel in) {
        customerId = in.readString();
        firstName = in.readString();
        lastName = in.readString();
        gender = in.readString();
        email = in.readString();
        userName = in.readString();
        password = in.readString();
        address = in.readString();
        fullTotal = in.readDouble();
        birthDate = in.readString();
        customerImage = in.readInt();
        customerBills = in.readHashMap(Bill.class.getClassLoader());
    }

    public static final Creator<Customer> CREATOR = new Creator<Customer>() {
        @Override
        public Customer createFromParcel(Parcel in) {
            return new Customer(in);
        }
        @Override
        public Customer[] newArray(int size){return new Customer[size];}
    };
    public int getCustomerImage(){return customerImage;}
    public Customer(String customerId,String firstName,String lastName,String gender,String email,String userName,String password,String address,String birthDate,Integer customerImage){
    this.customerId=customerId;
    this.firstName=firstName;
    this.lastName=lastName;

    }
}

