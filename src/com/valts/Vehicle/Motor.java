package com.valts.Vehicle;

public class Motor {
    public double capacity;

    public Motor(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "capacity=" + capacity +
                '}';
    }
}
