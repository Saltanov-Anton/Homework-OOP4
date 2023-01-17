import Drivers.DriverB;
import Transport.Bus;
import Transport.Car;
import Transport.Truck;

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

        System.out.println("Водитель " + driverVasya.getName() + " управляет автомодилем "
                + carSkyline.getModel() + " и будет учавствовать в заезде");

        
    }
}