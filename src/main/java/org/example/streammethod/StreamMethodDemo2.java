package org.example.streammethod;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethodDemo2 {
    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // count()
        long countEvenNumber = numberList.stream()
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("Count Even Number: " + countEvenNumber);

        // min()
        Optional<Integer> minNumber = numberList.stream()
                .min((n1, n2) -> {
                    return n1.compareTo(n2);
                });
        System.out.println("Min Number in list: " + minNumber.get());

        // max()
        Optional<Integer> maxNumber = numberList.stream()
                .min((n1, n2) -> {
                    return n1.compareTo(n2);
                });
        System.out.println("Max Number in list: " + maxNumber.get());

    }
}
