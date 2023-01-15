package Transport;
import Drivers.*;

public class Car<T extends DriverB> extends Transport implements Competing{
    public Car(String model, String brand, double volumeEngine) {
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
