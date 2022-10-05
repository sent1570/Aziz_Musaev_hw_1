package com.company;

public class Car_service {
    private int Tires;
    private int Spoilers;
    private int steeringWheels;

    public Car_service(int tires, int spoilers, int steeringWheels) {
        this.Tires = tires;
        this.Spoilers = spoilers;
        this.steeringWheels = steeringWheels;
    }


    public int getTires() {
        return Tires;
    }

    public int getSpoilers() {
        return Spoilers;
    }

    public int getSteeringWheels() {
        return steeringWheels;
    }
}
