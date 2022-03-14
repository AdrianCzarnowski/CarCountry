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

        Market business = new Market("business", List.of(poland, norway, italy));
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

        Producer producer1 = new Producer("BMW", "B3");
        Producer producer2 = new Producer("BMW", "A8");
        Producer producer3 = new Producer("BMW", "A1");
        Producer producer4 = new Producer("Toyota", "Corolla");
        Producer producer5 = new Producer("Fiat", "Tipo");
        Producer producer6 = new Producer("Suzuki", "Vitara");
        Producer producer7 = new Producer("Nissan", "Parajo");
        Producer producer8 = new Producer("Citroen", "550");
        Producer producer9 = new Producer("Jaguar", "s200");
        Producer producer10 = new Producer("Mercedes", "A7");


        List<Car> cars = new ArrayList<>(15);

        cars.add(new Car(producer1, true, cargo, dimension1, Car.SEGMENT_MEDIUM, italy));
        cars.add(new Car(producer3, false, business, dimension2, Car.SEGMENT_PREMIUM, poland));
        cars.add(new Car(producer7, false, gov, dimension3, Car.SEGMENT_STANDARD, germany));
        cars.add(new Car(producer6, true, publicTransport, dimension4, Car.SEGMENT_STANDARD, england));
        cars.add(new Car(producer2, true, privateTransport, dimension4, Car.SEGMENT_PREMIUM, norway));
        cars.add(new Car(producer8, false, cargo, dimension5, Car.SEGMENT_MEDIUM, italy));
        cars.add(new Car(producer9, true, business, dimension6, Car.SEGMENT_PREMIUM, poland));
        cars.add(new Car(producer3, false, publicTransport, dimension7, Car.SEGMENT_STANDARD, germany));
        cars.add(new Car(producer5, false, privateTransport, dimension8, Car.SEGMENT_PREMIUM, norway));
        cars.add(new Car(producer2, true, business, dimension9, Car.SEGMENT_MEDIUM, italy));
        cars.add(new Car(producer4, false, gov, dimension10, Car.SEGMENT_MEDIUM, poland));
        cars.add(new Car(producer10, true, cargo, dimension2, Car.SEGMENT_PREMIUM, germany));
        cars.add(new Car(producer7, false, business, dimension3, Car.SEGMENT_STANDARD, italy));
        cars.add(new Car(producer1, true, publicTransport, dimension8, Car.SEGMENT_STANDARD, poland));
        cars.add(new Car(producer4, false, publicTransport, dimension7, Car.SEGMENT_PREMIUM, poland));

        Car.check(cars);

    }

}