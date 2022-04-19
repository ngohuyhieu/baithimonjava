package com.company;

public class NganHang {

    private double balance;
    private double rate;

    public NganHang(double balance, double rate){
        this.balance = balance;
        this.rate = rate;
    }
    public double calculateInterest() {
        return balance * (rate/1200);
    }
}
