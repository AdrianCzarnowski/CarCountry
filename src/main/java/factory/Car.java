package factory;

import java.util.Arrays;
import java.util.List;

public class Car {

    public static final String SEGEMENT_PREMIUM = "premium";
    public static final String SEGEMENT_MEDIUM = "medium";
    public static final String SEGEMENT_STANDRAD = "standard";
    private static final List<String> SEGMENTS = Arrays.asList(SEGEMENT_PREMIUM, SEGEMENT_MEDIUM, SEGEMENT_STANDRAD);

    Producent producent;
    Market market;
    Dimension dimension;
    Country country;
    String segment;
    boolean isAutomaticGear;

    public Car(Producent producent, boolean isAutomaticGear, Market market,
               Dimension dimension, String segment, Country country) {

        if (!SEGMENTS.contains(segment)) throw new IllegalArgumentException();

        this.producent = producent;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.dimension = dimension;
        this.segment = segment;
        this.country = country;
    }

    public boolean checkCondition() {
        return (producent.getModel().equals("BMW")) && (isAutomaticGear) && (dimension.getTrankCapacity() > 300);
    }

    public static void check(List<Car> cars) {
        for (Car car : cars) {
            if (car.checkCondition())
                System.out.println(car.country.getCountryName() + " - " + car.country.getCountrySign());
        }

    }
}

