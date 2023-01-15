package Drivers;

import Transport.*;
public class Driver {

    private String name;

    private boolean hasDrivingLicense;

    private int experience;

    public Driver(String name, boolean hasDrivingLicense, int experience) {
        this.name = name;
        this.hasDrivingLicense = hasDrivingLicense;
        this.experience = experience;
    }

    public void startMoving(Transport transport) {
        transport.start();
    }

    public void stop(Transport transport) {
        transport.end();
    }

    public void refuelTransport(Competing transport) {
        transport.pitStop();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasDrivingLicense() {
        return hasDrivingLicense;
    }

    public void setHasDrivingLicense(boolean hasDrivingLicense) {
        this.hasDrivingLicense = hasDrivingLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
