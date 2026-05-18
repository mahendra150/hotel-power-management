package com.hotel.model;

public abstract class Equipment {

    protected boolean status;

    public void turnOn() {
        status = true;
    }

    public void turnOff() {
        status = false;
    }

    public boolean isOn() {
        return status;
    }
}
