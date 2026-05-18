package com.hotel.model;

public class Light extends Equipment {

    public int getPowerConsumption() {
        return status ? 5 : 0;
    }
}
