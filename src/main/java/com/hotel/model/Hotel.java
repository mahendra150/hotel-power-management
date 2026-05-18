package com.hotel.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Floor> floors;

    public Hotel(int floorsCount,
                 int mainCorridors,
                 int subCorridors) {

        floors = new ArrayList<>();

        for (int i = 1; i <= floorsCount; i++) {

            floors.add(
                    new Floor(
                            i,
                            mainCorridors,
                            subCorridors
                    )
            );
        }
    }

    public List<Floor> getFloors() {
        return floors;
    }
}
