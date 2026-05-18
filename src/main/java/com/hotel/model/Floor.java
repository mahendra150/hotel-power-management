package com.hotel.model;

import java.util.ArrayList;
import java.util.List;

public class Floor {

    private int floorNumber;

    private List<MainCorridor> mainCorridors;
    private List<SubCorridor> subCorridors;

    public Floor(int floorNumber,
                 int mainCount,
                 int subCount) {

        this.floorNumber = floorNumber;

        mainCorridors = new ArrayList<>();
        subCorridors = new ArrayList<>();

        for (int i = 1; i <= mainCount; i++) {
            mainCorridors.add(new MainCorridor(i));
        }

        for (int i = 1; i <= subCount; i++) {
            subCorridors.add(new SubCorridor(i));
        }
    }

    public List<MainCorridor> getMainCorridors() {
        return mainCorridors;
    }

    public List<SubCorridor> getSubCorridors() {
        return subCorridors;
    }

    public int getMaxPowerConsumption() {

        return (mainCorridors.size() * 15)
                + (subCorridors.size() * 10);
    }

    public int getCurrentPowerConsumption() {

        int total = 0;

        for (MainCorridor mc : mainCorridors) {
            total += mc.getLight().getPowerConsumption();
            total += mc.getAC().getPowerConsumption();
        }

        for (SubCorridor sc : subCorridors) {
            total += sc.getLight().getPowerConsumption();
            total += sc.getAC().getPowerConsumption();
        }

        return total;
    }
}
