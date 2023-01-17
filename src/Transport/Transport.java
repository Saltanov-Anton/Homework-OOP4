package Transport;
import Drivers.*;



public abstract class Transport<T extends Driver> {
    protected String model;
    protected String brand;
    protected double volumeEngine;

    private T driver;

    public Transport(String model, String brand, double volumeEngine) {
        this.model = model;
        this.brand = brand;
        this.volumeEngine = volumeEngine;
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

    @Override
    public String toString() {
        return "Transport{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", volumeEngine=" + volumeEngine +
                ", driver=" + driver +
                '}';
    }

    public abstract String printType();
}
