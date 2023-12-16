package org.example.map;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {
    public static void main(String[] args) {

        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");

        vehicles.stream()
                .forEach(name -> System.out.println("name : " + name + ", length : " + name.length()));

        vehicles.stream()
                .map(name -> name.length())
                .forEach(len -> System.out.println(len));
    }
}
