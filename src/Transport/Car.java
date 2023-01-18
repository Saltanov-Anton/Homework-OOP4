package Transport;
import Drivers.*;

public class Car<T extends DriverB> extends Transport implements Competing{

    enum BodyType {

        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        ESTATE("Универсал"),
        SUV("Внедорожник"),
        CUV("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private String bodyType;
        BodyType(String bodyType) {
            this.bodyType = bodyType;


        }

        public static BodyType findByBodyType(String bodyType) {
            for (BodyType type : values()) {
                if(type.getBodyType().equals(bodyType)) {
                    return type;
                }
            }
            return null;
        }

        public String getBodyType() {
            return bodyType;
        }

        @Override
        public String toString() {
            return "Тип кузова: "
                     + bodyType;
        }
    }

    BodyType bodyType;
    public Car(String model, String brand, double volumeEngine) {
        super(model, brand, volumeEngine);
    }

    @Override
    public String printType() {
        if (bodyType != null) {
            return bodyType.toString();
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

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(String type) {
        this.bodyType = BodyType.findByBodyType(type);
    }
}
