package com.example.c0775497_w2020_mad3125_fp.model;

import com.example.c0775497_w2020_mad3125_fp.model.Bill;

public class Internet extends Bill {
    private String providerName;
    private Double gbUsed;

    public Internet(String billId,String billDate,BillType billType,String providerName,Double gbUsed){
        super(billId,billDate,billType);
        this.providerName=providerName;
        this.gbUsed=gbUsed;
        this.billTotal=billCalculation();
    }

    @Override
    public Double billCalculation(){
        double billAmount = 0.0;
        if( gbUsed < 10){
            billAmount = 2 * gbUsed;
        }
        else {
            billAmount = 3 * gbUsed;
        }
        return billAmount;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public Double getGbUsed() {
        return gbUsed;
    }

    public void setGbUsed(Double gbUsed) {
        this.gbUsed = gbUsed;
    }
}