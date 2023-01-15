package Transport;

import Drivers.DriverC;

public class Truck<T extends DriverC> extends Transport implements Competing{

    public Truck(String model, String brand, double volumeEngine) {
        super(model, brand, volumeEngine);

    }

    @Override
    public void pitStop() {
        System.out.println(this.model + " Pit-Stop");
    }

    @Override
    public void bestLapTime() {
        System.out.println(this.model + " Best lap time");
    }

    @Override
    public void maxSpeed() {
        System.out.println(this.model + " max speed");
    }

    public void addDriver(T driver) {

        super.setDriver(driver);
    }
}
