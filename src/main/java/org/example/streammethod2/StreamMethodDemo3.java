package org.example.streammethod2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethodDemo3 {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("one", "two", "three", "one");
        System.out.println("item: " + stringList);

        // findAny()
        Optional<String>  item = stringList.stream().findAny();
        System.out.println("item.findAny(): " + item);
        System.out.println("item.get(): " + item.get());

        List<String> emptyList = Arrays.asList();
        Optional<String> empty = emptyList.stream().findAny();
        System.out.println("empty.findAny(): " + empty);
        System.out.println("empty.isPresent(): " + empty.isPresent());
        // System.out.println("empty.get()" + empty.get());

        // findFirst()
        Optional<String> firstFirstString = stringList.stream()
                .findFirst();
        System.out.println("findFirst.get(): " + firstFirstString.get());

        empty = emptyList.stream().findFirst();
        System.out.println("empty.findFirst(): " + empty);
        System.out.println("empty.get()" + empty.get());

    }
}
