package com.solid.principle.dip;

public class CreditCard implements BankCard{
    @Override
    public void doTransaction(long amount){
        System.out.println("Payment using Credit Card");
    }
}


