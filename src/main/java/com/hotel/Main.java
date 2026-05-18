package com.hotel;

import com.hotel.model.Hotel;
import com.hotel.service.HotelController;

public class Main {

    public static void main(String[] args) {

        Hotel hotel = new Hotel(2,1,2);

        HotelController controller =
                new HotelController(hotel);

        controller.motionDetected(1,2);

        System.out.println("Motion detected successfully");
    }
}
