package com.hotel;

import com.hotel.model.Floor;
import com.hotel.model.Hotel;
import com.hotel.service.HotelController;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HotelControllerTest {

    @Test
    void testMotionDetected() {

        Hotel hotel = new Hotel(2,1,2);

        HotelController controller =
                new HotelController(hotel);

        controller.motionDetected(1,2);

        Floor floor = hotel.getFloors().get(0);

        assertTrue(
                floor.getSubCorridors()
                        .get(1)
                        .getLight()
                        .isOn()
        );
    }
}
