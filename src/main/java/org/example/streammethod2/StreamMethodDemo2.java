package org.example.streammethod2;

import java.util.HashSet;
import java.util.Set;

// anyMatch()
// allMatch()
// nonMatch()
public class StreamMethodDemo2 {
    public static void main(String[] args) {

        Set<String> fruits = new HashSet<String>();
        fruits.add("One apple");
        fruits.add("One mango");
        fruits.add("Two apples");
        fruits.add("Two grapes");
        fruits.add("Two guavas");

        // anyMatch()
        boolean anyMatchone = fruits.stream().anyMatch(value -> value.startsWith("one"));
        System.out.println(anyMatchone);

        boolean anyMatchOne = fruits.stream().anyMatch(value -> value.startsWith("One"));
        System.out.println(anyMatchOne);

        // allMatch()
        boolean allMatchOne = fruits.stream().allMatch(value -> value.startsWith("One"));
        System.out.println(allMatchOne);

        // nonMatch()
        boolean noneMatchOne = fruits.stream().noneMatch(value -> value.startsWith("One"));
        System.out.println(noneMatchOne);

        boolean noneMatchThree = fruits.stream().noneMatch(value -> value.startsWith("Three"));
        System.out.println(noneMatchThree);
    }
}
