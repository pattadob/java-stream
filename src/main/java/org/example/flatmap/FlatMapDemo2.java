package org.example.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 {
    public static void main(String[] args) {

        List<String> shipA = Arrays.asList("Nico Robin", "Nami", "Brook");
        List<String> shipB = Arrays.asList("Sanji", "Monkey D. Luffy", "Chopper");
        List<String> shipC = Arrays.asList("Roronoa Zoro", "Franky", "Usopp");

        List<List<String>> pirateInClan = Arrays.asList(shipA, shipB, shipC);

        List<String> pirates = pirateInClan.stream()
                .flatMap(pirate -> pirate.stream())
                .collect(Collectors.toList());
        System.out.println(pirates);
    }
}
