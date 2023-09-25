package com.solid.principle.isp;

public class GooglePay  implements UPIPayments, CashBackManager{
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashBackAsCreditBalance() {
        // this feature is in the gpay
    }
}
