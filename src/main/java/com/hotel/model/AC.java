package com.hotel.model;

public class AC extends Equipment {

    private final int power;

    public AC(int power) {
        this.power = power;
    }

    public int getPowerConsumption() {
        return status ? power : 0;
    }
}
