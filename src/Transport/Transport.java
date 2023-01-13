package Transport;

public class Transport {
    protected String model;
    protected String brand;
    protected double volumeEngine;

    public Transport(String model, String brand, double volumeEngine) {
        this.model = model;
        this.brand = brand;
        this.volumeEngine = volumeEngine;
    }

    public void start() {
        System.out.println(this.model + " начал движение");
    }

    public void end() {
        System.out.println(this.model + " остановился");
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
}
