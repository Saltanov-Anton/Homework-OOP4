package Transport;

import Drivers.DriverC;

public class Truck<T extends DriverC> extends Transport implements Competing {


    enum LoadCapacity {
        N1(null, 3.5f),
        N2(3.5f, 12f),
        N3(12f, null);
        private final Float lowerBound;
        private final Float upperBound;


        LoadCapacity(Float lowerBound, Float upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }

        public static LoadCapacity findByLoad(Float load) {
            Float min;
            Float max;
            for (LoadCapacity loadCapacity1 : values()) {
                min = loadCapacity1.getLowerBound() == null ? min = 0f : loadCapacity1.getLowerBound();
                max = loadCapacity1.getUpperBound() == null ? max = 100f : loadCapacity1.getUpperBound();

                if (min <= load && load <= max) {
                    return loadCapacity1;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            if (upperBound == null) {
                return "Грузоподъемность: от " +
                         lowerBound + " тонн";
            } else if (lowerBound == null) {
                return "Грузоподъемность: до "
                        + upperBound + " тонн";
            } else {
                return "Грузоподъемность: от " +
                        lowerBound + " тонн " +
                        "до " + upperBound + " тонн";
            }
        }

        public Float getLowerBound() {
            return lowerBound;
        }

        public Float getUpperBound() {
            return upperBound;
        }
    }

    private LoadCapacity loadCapacity;

    public Truck(String model, String brand, double volumeEngine) {
        super(model, brand, volumeEngine);

    }

    @Override
    public String printType() {
        if (loadCapacity != null) {
            return loadCapacity.toString();
        } else {
            return "Данных по транспортному средству недостаточно";
        }
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

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(Float loadCapacity) {
        this.loadCapacity = LoadCapacity.findByLoad(loadCapacity);
    }
}
