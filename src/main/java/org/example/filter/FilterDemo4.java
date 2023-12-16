package org.example.filter;

import java.util.ArrayList;
import java.util.List;

class Pirate{
    int id;
    String name;
    double bounty;
    public Pirate(int id, String name, double bounty){
        this.id = id;
        this.name = name;
        this.bounty = bounty;
    }
}

public class FilterDemo4 {
    public static void main(String[] args) {
        List<Pirate> pirateList = new ArrayList<Pirate>();
        pirateList.add(new Pirate(1, "Shanks", 4048900000.00));
        pirateList.add(new Pirate(2, "Monkey D. Luffy", 3000000000.00));
        pirateList.add(new Pirate(3, "Roronoa Zoro", 1110000000.00));
        pirateList.add(new Pirate(4, "Usopp", 500000000.00));
        pirateList.add(new Pirate(5, "Sanji", 1023000000.00));

        pirateList.stream()
                .filter(p -> p.bounty > 2000000000.00)
                .forEach(p -> System.out.println(p.bounty));

        pirateList.stream()
                .filter(p -> p.bounty > 2000000000.00)
                .forEach(p -> System.out.println(String.format("%,.2f", p.bounty)));
    }
}
