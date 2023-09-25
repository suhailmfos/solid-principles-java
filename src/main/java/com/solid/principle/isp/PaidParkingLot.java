package com.solid.principle.isp;

public interface PaidParkingLot extends ParkingLot{
    double calculateFee(Car car); // Returns the price based on number of hours
    void doPayment(Car car);
}
