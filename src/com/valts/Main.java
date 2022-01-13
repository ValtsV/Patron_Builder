package com.valts;

import com.valts.Vehicle.Motor;
import com.valts.Vehicle.Vehicle;
import com.valts.Vehicle.VehicleBuilder;

public class Main {

    public static void main(String[] args) {
        Motor motor = new Motor(2.4);
        Vehicle car1 = new VehicleBuilder().setMotor(motor).setModel("BRZ").setDoorCount(2).build();
    }
}
