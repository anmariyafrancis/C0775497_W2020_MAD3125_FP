package com.example.c0775497_w2020_mad3125_fp;

import android.os.Parcel;
import android.os.Parcelable;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
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
        this.email=email;
        this.userName=userName;
        this.password=password;
        this.gender=gender;
        this.address=address;
        this.birthDate=birthDate;
        this.customerImage=customerImage;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Double getFullTotal() {
        return fullTotal;
    }

    public void setFullTotal(Double fullTotal) {
        this.fullTotal = fullTotal;
    }

    public void setCustomerImage(int customerImage) {
        this.customerImage = customerImage;
    }

    public HashMap<String, Bill> getCustomerBills() {
        return customerBills;
    }

    public void setCustomerBills(HashMap<String, Bill> customerBills) {
        this.customerBills = customerBills;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(customerId);
        dest.writeString(firstName);
        dest.writeString(lastName);
        dest.writeString(gender);
        dest.writeString(email);
        dest.writeString(userName);
        dest.writeString(password);
        dest.writeString(address);
        dest.writeString(birthDate);
        dest.writeMap(customerBills);
        if (fullTotal == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(fullTotal);
        }
        dest.writeInt(customerImage);
    }

    public ArrayList<Bill> getBills()
    {
        Collection<Bill> tempBillValues = customerBills.values();
        ArrayList<Bill> billsList = new ArrayList<>(tempBillValues);
        return billsList;
    }

    public double getTotalAmount()
    {
        double fullTotalCustomers = 0.0d;
        for (Bill b : customerBills.values())
        {
            fullTotalCustomers += b.billTotal;
        }
        return fullTotalCustomers;
    }
}

