package com.hotel.model;

public abstract class Corridor {

    protected int number;
    protected Light light;
    protected AC ac;

    public Corridor(int number, int acPower) {
        this.number = number;
        this.light = new Light();
        this.ac = new AC(acPower);
    }

    public Light getLight() {
        return light;
    }

    public AC getAC() {
        return ac;
    }

    public int getNumber() {
        return number;
    }
}
