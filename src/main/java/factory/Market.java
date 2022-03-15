package factory;

import java.util.List;

public class Market {

    private final int a = 3;
    private String name;
    private List<Country> countries;

    public Market(String name, List<Country> countries) {

        this.name = name;
        this.countries = countries;

        if (countries.size() < a || countries.size() == 0 ) {
            System.out.println("Your object is not supported. Market have to 3 countries as minimum");
            throw new IllegalArgumentException();
        }

    }
}

