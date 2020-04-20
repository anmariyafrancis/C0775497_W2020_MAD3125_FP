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

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public BillType getBillType() {
        return billType;
    }

    public void setBillType(BillType billType) {
        this.billType = billType;
    }

    public Double getBillTotal() {
        return billTotal;
    }

    public void setBillTotal(Double billTotal) {
        this.billTotal = billTotal;
    }
}
