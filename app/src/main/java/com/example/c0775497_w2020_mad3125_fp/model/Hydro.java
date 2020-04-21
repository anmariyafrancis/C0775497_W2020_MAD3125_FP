package com.example.c0775497_w2020_mad3125_fp.model;

public class Hydro extends Bill {
    private String companyName;
    private Integer unitsUsed;

    public Hydro(String billId,String billDate,BillType billType,String companyName,Integer unitsUsed){
        super(billId,billDate,billType);
        this.companyName=companyName;
        this.unitsUsed=unitsUsed;
        this.billTotal=billCalculation();
    }
    @Override
    public double billCalculation(){
        double billAmount = 0.0;
        if (unitsUsed < 10)
        {
            billAmount = 2 * unitsUsed;
        }
        else
        {
            billAmount = 3 * unitsUsed;
        }
        return billAmount;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getUnitsUsed() {
        return unitsUsed;
    }

    public void setUnitsUsed(Integer unitsUsed) {
        this.unitsUsed = unitsUsed;
    }
}
