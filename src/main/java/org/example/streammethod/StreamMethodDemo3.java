package org.example.streammethod;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethodDemo3 {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("A", "B", "C", "1", "2", "3");

        // reduce()
        Optional<String> combineString = stringList.stream()
                .reduce((combineValue, value) -> {
                    System.out.println(combineValue + ", " + value);
                    return combineValue + value;
                });
        System.out.println(combineString.get());

        String joinString = String.join("", stringList);
        System.out.println(joinString);

    }
}
