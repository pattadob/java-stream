package org.example.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapDemo4 {
    public static void main(String[] args) {

        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train", "car");

        Map<String, Integer> vehiclesLength = new HashMap<String, Integer>();

        vehiclesLength = vehicles.stream()
                .distinct()
                .collect(Collectors.toMap(String::toString, String::length));
        System.out.println(vehiclesLength);

        vehiclesLength = vehicles.stream()
                .collect(Collectors.toMap(String::toString, String::length, (existing, replacement) -> existing));
        System.out.println(vehiclesLength);
    }
}
