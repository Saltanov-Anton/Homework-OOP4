import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import Transport.Bus;
import Transport.Car;
import Transport.Transport;
import Transport.Truck;
import Transport.Mechanic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Car carSkyline = new Car("Skyline GTR", "Nissan", 3.0);
        Car carBMW = new Car("M3 GTR", "BMW", 4.0);
        Car carMoskvish = new Car("2141", "ISH", 1.5);
        Car carFerrari = new Car("250 GTO", "Ferrari", 3.0);

        Truck trackKamaz = new Truck("435091", "KamAZ", 12.98);
        Truck trackKenworth = new Truck("W900", "Kenworth", 12.8);
        Truck truckZil = new Truck("131", "ZIL", 6.0);
        Truck truckMaz = new Truck("6440 RR", "MAZ", 12.66);

        Bus busPaz3203 = new Bus("3203", "PAZ", 4.5);
        Bus busRoutemaster = new Bus("Routemaster", "AEC", 9.6);
        Bus busTc2000 = new Bus("TC/2000", "Blue Bird", 5.9);
        Bus bus5921 = new Bus("5921", "LiAZ", 9.3);

        DriverB driverVasya = new DriverB("Vasya", true, 5);
        carSkyline.addDriver(driverVasya);

        DriverC driverPetya = new DriverC("Petr", true, 0);
        trackKamaz.addDriver(driverPetya);

        DriverD driverMihalich = new DriverD("Mihalich", true, 25);
        bus5921.addDriver(driverMihalich);

        Mechanic mechKurosawa = new Mechanic("Takumi Kurosawa", "Nissan");

        Mechanic mechPetrovich = new Mechanic("Semen Petrovich", "STO");

        carSkyline.setMechanics(mechKurosawa);
        trackKamaz.setMechanics(mechPetrovich);
        bus5921.setMechanics(mechPetrovich);
        bus5921.setMechanics(mechPetrovich);
        bus5921.setMechanics(mechKurosawa);

        List<Transport<?>> raceTransport = new ArrayList<>();
        raceTransport.add(carSkyline);
        raceTransport.add(trackKamaz);
        raceTransport.add(bus5921);

//        System.out.println(carSkyline.printDriverAndMachanic());
//        System.out.println(bus5921.printDriverAndMachanic());
        System.out.println(bus5921.getMechanics());


    }
}