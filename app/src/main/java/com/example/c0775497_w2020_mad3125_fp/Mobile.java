package com.example.c0775497_w2020_mad3125_fp;

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
    }
}
