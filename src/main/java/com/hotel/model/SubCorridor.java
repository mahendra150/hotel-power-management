package com.hotel.model;

public class SubCorridor extends Corridor {

    public SubCorridor(int number) {
        super(number, 10);

        light.turnOff();
        ac.turnOn();
    }
}
