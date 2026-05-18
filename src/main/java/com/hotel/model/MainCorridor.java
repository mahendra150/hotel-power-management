package com.hotel.model;

public class MainCorridor extends Corridor {

    public MainCorridor(int number) {
        super(number, 15);

        light.turnOn();
        ac.turnOn();
    }
}
