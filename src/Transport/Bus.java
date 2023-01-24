package Transport;

import Drivers.DriverD;

public class Bus<T extends DriverD> extends Transport implements Competing{

    enum Capacity {
        ESPECIALLY_SMALL(0, 10),
        SMALL(11, 25),
        MIDDLE(26, 50),
        BIG(51, 80),
        ESPECIALLY_BIG(81, 120);

        private final Integer lowerBound;
        private final Integer upperBound;

        Capacity(Integer lowerBound, Integer upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }

        public static Capacity findByCapacity(Integer capacity) {
            for (Capacity capacity1 : values()) {
                if (capacity1.getLowerBound() < capacity && capacity <= capacity1.getUpperBound()) {
                    return capacity1;
                }
            }
            return null;
        }

        public Integer getLowerBound() {
            return lowerBound;
        }

        public Integer getUpperBound() {
            return upperBound;
        }

        @Override
        public String toString() {
            return "Вместимость: " +
                    "<" + lowerBound +
                    "> - <" + upperBound +
                    ">";
        }
    }

    private Capacity capacity;

    public Bus(String model, String brand, double volumeEngine) {
        super(model, brand, volumeEngine);
    }

    @Override
    public String printType() {
        if (capacity != null) {
            return capacity.toString();
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

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = Capacity.findByCapacity(capacity);
    }


}
