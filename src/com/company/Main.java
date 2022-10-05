package com.company;

public class Main {

    public static void main(String[] args) {
Sports_cars sports_cars = new Sports_cars("Bravo","”À. œ”ÿ »Õ¿",Color.BLACK,
        new Car_service(6,3, 4),Car_body.CONVERTIBLE);
        System.out.println(sports_cars.getInfo());
sports_cars.makeSignal(3,"Beeep");

Ferrari ferrari = new Ferrari("Speed","”À. À≈–ÃŒÕ“Œ¬¿",Color.RED,new Car_service(5,2,3),Car_body.CONVERTIBLE,
        "F50",1987,6.5);
        System.out.println(ferrari.getInfo());
ferrari.makeSignal("Beep",4,"is driving");

        Ferrari ferrari2 = new Ferrari("Fast","”À. “€Õ€—“¿ÕŒ¬¿",Color.WHITE,new Car_service(7,3, 4),Car_body.COUPE
                ,"F8 tributo",1998,7.0);
        System.out.println(ferrari2.getInfo());
        ferrari2.makeSignal("Beep",5,"is driving");


    }

}
