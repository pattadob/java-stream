package org.example.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");
        List<String> vehicleUpperCase = new ArrayList<String>();

        for (String name : vehicles) {
            vehicleUpperCase.add(name.toUpperCase());
        }
        System.out.println(vehicleUpperCase);

        List<String> vehicleUpperCase2 = new ArrayList<String>();

        vehicleUpperCase2 = vehicles.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(vehicleUpperCase2);

        vehicleUpperCase2 = vehicles.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(vehicleUpperCase2);

        vehicles.stream()
                .forEach(name -> System.out.println(name.toUpperCase()));
    }
}
