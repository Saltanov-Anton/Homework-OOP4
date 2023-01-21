package Transport;
import Drivers.*;

import java.util.ArrayList;
import java.util.List;


public abstract class Transport<T extends Driver> {
    protected String model;
    protected String brand;
    protected double volumeEngine;

    private T driver;

    private List<Mechanic> mechanics = new ArrayList<>();

    public Transport(String model, String brand, double volumeEngine) {
        this.model = model;
        this.brand = brand;
        this.volumeEngine = volumeEngine;
    }

    public abstract String printType();

    public void passDiagnostics(T driver) throws DriverInconsistencyException {
        System.out.println(this.getBrand() + " " + this.getModel() + " не может пройти диагностику");
    }

    public void start() {
        System.out.println(this.model + " начал движение под управлением водителя "
                + driver.getName());
    }

    public void end() {
        System.out.println(this.model + " остановился");
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getVolumeEngine() {
        return volumeEngine;
    }

    public void setVolumeEngine(double volumeEngine) {
        this.volumeEngine = volumeEngine;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public void setMechanics(Mechanic mechanic) {
        this.mechanics.add(mechanic);
    }

    public String printDriverAndMachanic() {
        return "Водитель - " + this.getDriver().getName() + " "
                + "Механик - " + this.mechanics;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", volumeEngine=" + volumeEngine +
                ", driver=" + driver +
                '}';
    }
}
