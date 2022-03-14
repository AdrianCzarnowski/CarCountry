import factory.*;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {

        Country poland = new Country("Poland", 'P');
        Country germany = new Country("Germany", 'G');
        Country norway = new Country("Norway", 'N');
        Country england = new Country("England", 'E');
        Country italy = new Country("Italy", 'I');

        Market busniess = new Market("business", List.of(poland, norway, italy));
        Market cargo = new Market("cargo", List.of(poland, norway, england));
        Market publicTransport = new Market("publicTransport", List.of(germany, england, italy));
        Market privateTransport = new Market("privateTransport", List.of(poland, england, germany));
        Market gov = new Market("gov", List.of(norway, england, italy));

        Dimension dimension1 = new Dimension(15, 156, 350);
        Dimension dimension2 = new Dimension(16, 165, 340);
        Dimension dimension3 = new Dimension(17, 176, 280);
        Dimension dimension4 = new Dimension(18, 176, 310);
        Dimension dimension5 = new Dimension(19, 180, 280);
        Dimension dimension6 = new Dimension(20, 148, 345);
        Dimension dimension7 = new Dimension(21, 190, 322);
        Dimension dimension8 = new Dimension(22, 200, 350);
        Dimension dimension9 = new Dimension(23, 234, 311);
        Dimension dimension10 = new Dimension(24, 210, 309);

        Producent producent1 = new Producent("BMW", "B3");
        Producent producent2 = new Producent("BMW", "A8");
        Producent producent3 = new Producent("BMW", "A1");
        Producent producent4 = new Producent("Toyota", "Corolla");
        Producent producent5 = new Producent("Fiat", "Tipo");
        Producent producent6 = new Producent("Suzuki", "Vitara");
        Producent producent7 = new Producent("Nissan", "Parajo");
        Producent producent8 = new Producent("Citroen", "550");
        Producent producent9 = new Producent("Jaguar", "s200");
        Producent producent10 = new Producent("Mercedes", "A7");


        List<Car> cars = new ArrayList<>(15);

        cars.add(new Car(producent1, true, cargo, dimension1, Car.SEGEMENT_MEDIUM, italy));
        cars.add(new Car(producent3, false, busniess, dimension2, Car.SEGEMENT_PREMIUM, poland));
        cars.add(new Car(producent7, false, gov, dimension3, Car.SEGEMENT_STANDRAD, germany));
        cars.add(new Car(producent6, true, publicTransport, dimension4, Car.SEGEMENT_STANDRAD, england));
        cars.add(new Car(producent2, true, privateTransport, dimension4, Car.SEGEMENT_PREMIUM, norway));
        cars.add(new Car(producent8, false, cargo, dimension5, Car.SEGEMENT_MEDIUM, italy));
        cars.add(new Car(producent9, true, busniess, dimension6, Car.SEGEMENT_PREMIUM, poland));
        cars.add(new Car(producent3, false, publicTransport, dimension7, Car.SEGEMENT_STANDRAD, germany));
        cars.add(new Car(producent5, false, privateTransport, dimension8, Car.SEGEMENT_PREMIUM, norway));
        cars.add(new Car(producent2, true, busniess, dimension9, Car.SEGEMENT_MEDIUM, italy));
        cars.add(new Car(producent4, false, gov, dimension10, Car.SEGEMENT_MEDIUM, poland));
        cars.add(new Car(producent10, true, cargo, dimension2, Car.SEGEMENT_PREMIUM, germany));
        cars.add(new Car(producent7, false, busniess, dimension3, Car.SEGEMENT_STANDRAD, italy));
        cars.add(new Car(producent1, true, publicTransport, dimension8, Car.SEGEMENT_STANDRAD, poland));
        cars.add(new Car(producent4, false, publicTransport, dimension7, Car.SEGEMENT_PREMIUM, poland));

        Car.check(cars);

    }

}