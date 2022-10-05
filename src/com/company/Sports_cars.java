package com.company;

public class Sports_cars extends Car_showroom{
private Color color;
private Car_service car_service;
private Car_body car_body;

    public Sports_cars(String name, String address, Color color, Car_service car_service, Car_body car_body) {
        super(name, address);
        this.color = color;
        this.car_service = car_service;
        this.car_body = car_body;
    }
    public String getInfo() {
        return "\nCar showroom name : " + getName() +
                "\nCar showroom address: " + getAddress() +
                "\nColor: " + color +
                "\nAbbitional spare parts:"+
                " Tires: " + car_service.getTires() +
                " Spoilers: " + car_service.getSpoilers() +
                " Steering Wheels: " + car_service.getSteeringWheels() +
                "\nCar body: " + car_body;

    }
    void makeSignal (String signal,int count ) {
        for (int i = 0; i < count; i++) {
            System.out.println(signal);
        }
    }
    void makeSignal (String signal){
        System.out.println(signal);

    }
    final void makeSignal (int count,String signal ) {
        for (int i = 0; i < count; i++) {
            System.out.println(signal);
        }
    }
    public Color getColor() {
        return color;
    }

    public Car_service getCar_service() {
        return car_service;
    }

    public Car_body getCar_body() {
        return car_body;
    }
}
