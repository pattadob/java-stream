package org.example.streammethod2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethodDemo4 {
    public static void main(String[] args) {

        List<String> animalList = Arrays.asList("Dog", "Cat", "Elephant");
        List<String> birdList = Arrays.asList("Peacock", "Parrot", "Crow");

        Stream<String> stream1 = animalList.stream();
        Stream<String> stream2 = birdList.stream();

        // concat()
        List<String> allAnimalList = Stream.concat(stream1, stream2).collect(Collectors.toList());
        System.out.println(allAnimalList);
    }
}
