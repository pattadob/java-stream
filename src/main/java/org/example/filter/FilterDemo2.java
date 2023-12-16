package org.example.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Nico Robin", "Nami", "Brook", "Sanji", "Monkey D. Luffy", "Chopper", "Roronoa Zoro", "Franky", "Usopp");
        List<String> longNames = names.stream()
                .filter(str -> str.length() > 10)
                .collect(Collectors.toList());
        System.out.println(longNames);

        names.stream()
                .filter(str -> str.length() > 10)
                .forEach(str -> System.out.println(str));

        int longestNameLength = names.stream()
                .mapToInt(str -> str.length())
                .max().getAsInt();
        System.out.println(longestNameLength);

    }
}
