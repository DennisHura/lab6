package com.company;

import bicycle.Bicycle;
import car.Car;
import jumpers.Jumpers;
import rollerSkates.RollerSkates;
import server.Server;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        Random random = new Random();
        int num;
        Server serv = new Server(4,15);

        Bicycle b;
        Car c;
        RollerSkates r;
        Jumpers j;

        for(int i=0;i<15;i++) {
            num = random.nextInt(4);
            switch (num) {
                case 0:
                    b = new Bicycle(i);
                    serv.addTransport(0, b,i);
                    break;
                case 1:
                    c = new Car(i);
                    serv.addTransport(1, c,i);
                    break;
                case 2:
                    r = new RollerSkates(i);
                    serv.addTransport(2, r,i);
                    break;
                case 3:
                    j = new Jumpers(i);
                    serv.addTransport(3, j,i);
                    break;
            }
        }

        int veh[] = serv.getCountVehicles();
        System.out.println("Велосипедов: " + veh[0]);
        System.out.println("Автомобилей: " + veh[1]);
        System.out.println("Роликов: " + veh[2]);
        System.out.println("Джамперов: " + veh[3]);


    }
}
