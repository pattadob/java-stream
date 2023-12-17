package org.example.streammethod2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// sorted
public class StreamMethodDemo1 {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(3, 4, 5, 2, 7, 1, 9, 10, 6);
        List<Integer> sortedList1 = list1.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedList1);

        List<Integer> reverseSortedList1 = list1.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(reverseSortedList1);
    }
}
