package com.example.c0775497_w2020_mad3125_fp;

public class Sign {
    private static Sign repoObj = new Sign();
    public static Sign getInstance() {
        return repoObj;
    }
    private Sign()
    { }

    public String doubleFormatter(Double d)
    {
        return String.format("$ " + "%,.2f", d);
    }
}
