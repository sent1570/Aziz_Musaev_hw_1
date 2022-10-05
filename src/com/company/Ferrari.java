package com.company;

public final class Ferrari extends Sports_cars{
 private String model;
 private int year;
private double engineVolume;

    public Ferrari(String name, String address,Color color, Car_service car_service, Car_body car_body, String model,
                   int year, double engineVolume) {
        super(name, address, color, car_service, car_body);
        this.model = model;
        this.year = year;
        this.engineVolume = engineVolume;
    }
    public String getInfo() {
        return super.getInfo() +
                "\nModel Of Car : " + getModel() +
                "\nYear of manufacture: " + getYear() +
                "\nEngine volume: " + getEngineVolume();



    }

    @Override
    void makeSignal(String signal, int count) {
        super.makeSignal(signal, count);
            System.out.println("Ferrari "+ getModel() +  " " + "is driving");
        }


    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
}
