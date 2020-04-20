package com.example.c0775497_w2020_mad3125_fp;

import java.io.Serializable;

public class Bill implements Serializable {
    public enum BillType{
        Hydro,
        Internet,
        Mobile,
    }
    String billId;
    String billDate;
    BillType billType;
    Double billTotal=0.0;

    Bill(String billId,String billDate,BillType billType){
        this.billId=billId;
        this.billDate=billDate;
        this.billType=billType;
    }

    public Double billCalculation(){
        double sampleAmount=0.0;
        return sampleAmount;
    }
}
