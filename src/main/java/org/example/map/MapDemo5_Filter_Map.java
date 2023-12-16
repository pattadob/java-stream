package org.example.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Pirate {
    int id;
    String name;
    double bounty;

    public Pirate(int id, String name, double bounty) {
        this.id = id;
        this.name = name;
        this.bounty = bounty;
    }
}

public class MapDemo5_Filter_Map {
    public static void main(String[] args) {
        List<Pirate> pirateList = Arrays.asList(
                new Pirate(1, "Shanks", 4048900000.00),
                new Pirate(2, "Monkey D. Luffy", 3000000000.00),
                new Pirate(3, "Roronoa Zoro", 1110000000.00),
                new Pirate(4, "Usopp", 500000000.00),
                new Pirate(5, "Sanji", 1023000000.00)
        );

        List<Double> bountyList = pirateList.stream()
                .filter(pirate -> pirate.bounty > 2000000000)
                .map(pirate -> pirate.bounty)
                .collect(Collectors.toList());
        System.out.println(bountyList);

        pirateList.stream()
                .filter(pirate -> pirate.bounty > 2000000000)
                .map(pirate -> "name : " + pirate.name + ", bounty : " + pirate.bounty)
                .forEach(System.out::println);
    }
}
