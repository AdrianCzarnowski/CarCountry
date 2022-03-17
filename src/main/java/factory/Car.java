package factory;

import java.util.Arrays;
import java.util.List;

public class Car {

    public static final String SEGMENT_PREMIUM = "premium";
    public static final String SEGMENT_MEDIUM = "medium";
    public static final String SEGMENT_STANDARD = "standard";
    private static final List<String> SEGMENTS = Arrays.asList(SEGMENT_PREMIUM, SEGMENT_MEDIUM, SEGMENT_STANDARD);

    Producer producer;
    Market market;
    Dimension dimension;
    Country country;
    String segment;
    boolean isAutomaticGear;

    public Car(Producer producer, boolean isAutomaticGear, Market market,
               Dimension dimension, String segment, Country country) {

        if (!SEGMENTS.contains(segment)) throw new IllegalArgumentException();

        this.producer = producer;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.dimension = dimension;
        this.segment = segment;
        this.country = country;
    }

    private boolean checkCondition() {
        return (producer.getModel().equals("BMW")) && (isAutomaticGear) && (dimension.getTrunkCapacity() > 1300);
    }

    public static void check(List<Car> cars) {
        for (Car car : cars) {
            if (car.checkCondition())
                System.out.println(car.country.getCountryName() + " - " + car.country.getCountrySign());
        }
        System.out.println("0 objects avaliable");

    }
}

