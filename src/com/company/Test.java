package com.company;

import com.company.classes.City;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {
	List<City> cityList = new ArrayList<>(List.of(
            new City(1, "Bishkek"),
            new City(2, "Almata"),
            new City(3, "Tashkent"),
            new City(4, "Istanbul"),
            new City(5, "New York"),
            new City(6, "Astana"),
            new City(7, "Osh"),
            new City(8, "Chicago"),
            new City(9, "Mumbai"),
            new City(10, "Kiev")
    ));

        TreeSet<City> cityTreeSet = new TreeSet<>();
        System.out.println(citiesWithOddCode(cityTreeSet, cityList));

    }

    public static Set<City>  citiesWithOddCode(Set<City> cityTreeSet, List<City> cityList){
        for(City i: cityList) {
            if(i.getCode() % 2 == 1) {
                cityTreeSet.add(i);
            }
        }
        return cityTreeSet;
    }
}
