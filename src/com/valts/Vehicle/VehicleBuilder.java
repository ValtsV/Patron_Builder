package com.valts.Vehicle;

public class VehicleBuilder {
    Vehicle vehicle = new Vehicle();

    public VehicleBuilder Vehicle() {
        return this;
    }

    public Vehicle build(){
        return this.vehicle;
    }

    public VehicleBuilder setModel(String modelName) {
        vehicle.model = modelName;
        System.out.println("model name set to " + modelName);

        return this;
    }

    public VehicleBuilder setMotor(Motor motor) {
        vehicle.motor = motor;
        System.out.println("motor set to " + motor);
        return this;
    }

    public VehicleBuilder setDoorCount(int count) {
        vehicle.doorCount = count;
        System.out.println("door count set to " + count);

        return this;
    }
}
