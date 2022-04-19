package com.company;

public class TestNganHang{
    public static void main(String[] args) {
        NganHang b1 = new NganHang(3000, 20);
        System.out.printf("Calculate Interest: $%.2f%n", b1.calculateInterest());
    }
}
