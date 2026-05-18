package com.hotel.service;

import com.hotel.model.Floor;
import com.hotel.model.Hotel;
import com.hotel.model.SubCorridor;

public class HotelController {

    private Hotel hotel;

    public HotelController(Hotel hotel) {
        this.hotel = hotel;
    }

    public void motionDetected(int floorNo, int subCorridorNo) {

        Floor floor = hotel.getFloors().get(floorNo - 1);

        SubCorridor target =
                floor.getSubCorridors().get(subCorridorNo - 1);

        target.getLight().turnOn();

        while (floor.getCurrentPowerConsumption()
                > floor.getMaxPowerConsumption()) {

            for (SubCorridor sc : floor.getSubCorridors()) {

                if (sc != target && sc.getAC().isOn()) {
                    sc.getAC().turnOff();
                    break;
                }
            }
        }
    }

    public void noMotion(int floorNo, int subCorridorNo) {

        Floor floor = hotel.getFloors().get(floorNo - 1);

        SubCorridor target =
                floor.getSubCorridors().get(subCorridorNo - 1);

        target.getLight().turnOff();
        target.getAC().turnOn();
    }
}
