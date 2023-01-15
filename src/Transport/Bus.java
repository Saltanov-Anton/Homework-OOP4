package Transport;

import Drivers.DriverD;

public class Bus<T extends DriverD> extends Transport implements Competing{

    public Bus(String model, String brand, double volumeEngine) {
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
