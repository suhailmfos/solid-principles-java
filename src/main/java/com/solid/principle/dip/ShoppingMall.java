package com.solid.principle.dip;

public class ShoppingMall {

    private BankCard card;

    public ShoppingMall(BankCard card) {
        this.card = card;
    }

    public void doPurchaseSomething(long amount){
        card.doTransaction(amount);
    }

    public static void main(String[] args) {
        BankCard card;
        card = new CreditCard();
        ShoppingMall mall = new ShoppingMall(card);
        mall.doPurchaseSomething(5000);
    }
}
