package org.example.streammethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Not-terminal/processing methods
// - distinct()
// - limit()

// Terminal
// - count()
// - forEach()

public class StreamMethodDemo1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Chopper", "Nami", "Brook", "Sanji", "Monkey D. Luffy", "Chopper", "Roronoa Zoro", "Sanji", "Sanji");

        // distinct
        List<String> distinctName = names.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct Name: " + distinctName);

        names.stream()
                .distinct()
                .forEach(System.out::println);

        // count
        long distinctCount = names.stream()
                .distinct()
                .count();
        System.out.println("Count: " + distinctCount);

        // limit
        List<String> limitedName = names.stream()
                .limit(4)
                .collect(Collectors.toList());
        System.out.println("Limit name: " + limitedName);

        names.stream()
                .limit(4)
                .forEach(System.out::println);
    }
}
