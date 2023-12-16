package org.example.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Nico Robin", "Nami", "Brook", null, "Monkey D. Luffy", "Chopper", "Roronoa Zoro", "Franky", null);
        List<String> result = names.stream()
                .filter(str -> str != null)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
