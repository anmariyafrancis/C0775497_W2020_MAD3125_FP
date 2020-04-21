package com.example.c0775497_w2020_mad3125_fp.model;

public class Mobile extends Bill {
    private String manufacturerName;
    private String planDetails;
    private String mobNumber;
    private Integer mobGbUsed;
    private Integer minute;

    public Mobile(String billId,String billDate,BillType billType,String manufacturerName,String planDetails,String mobNumber,
                  Integer mobGbUsed,Integer minute){
        super(billId,billDate,billType);
        this.manufacturerName=manufacturerName;
        this.planDetails=planDetails;
        this.mobNumber=mobNumber;
        this.mobGbUsed=mobGbUsed;
        this.minute=minute;
        this.billTotal=billCalculation();
    }

    @Override
    public double billCalculation(){
        double billAmount = 0.0;
        billAmount = (this.mobGbUsed) * 20 + (this.minute) * 0.5;
        return billAmount;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getPlanDetails() {
        return planDetails;
    }

    public void setPlanDetails(String planDetails) {
        this.planDetails = planDetails;
    }

    public String getMobNumber() {
        return mobNumber;
    }

    public void setMobNumber(String mobNumber) {
        this.mobNumber = mobNumber;
    }

    public Integer getMobGbUsed() {
        return mobGbUsed;
    }

    public void setMobGbUsed(Integer mobGbUsed) {
        this.mobGbUsed = mobGbUsed;
    }

    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }
}
