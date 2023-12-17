package org.example.streammethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethodDemo5 {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("A", "B", "C", "1", "2", "3");

        List<String> alphabetic = stringList.stream()
                .filter(n -> Character.isAlphabetic(n.charAt(0)))
                .collect(Collectors.toList());
        System.out.println(alphabetic);

        List<String> digit = stringList.stream()
                .filter(n -> Character.isDigit(n.charAt(0)))
                .collect(Collectors.toList());
        System.out.println(digit);

        List<String> string2List = Arrays.asList("A", "B", "C", "1", "2", "3", "ABC", "A0", "123", "1A", "A0B", "1A2", "A01BC", "1AB23");

        List<String> extractAlphabet = string2List.stream()
                .filter(n -> n.matches("^[A-Z]*$"))
                .collect(Collectors.toList());
        System.out.println(extractAlphabet);

        List<String> extractDigit = string2List.stream()
                .filter(n -> n.matches("^[0-9]*$"))
                .collect(Collectors.toList());
        System.out.println(extractDigit);

        List<String> combineAlphabetAndDigit = string2List.stream()
                .filter(n -> n.matches("^(?=.*[A-Za-z])(?=.*[0-9]).+"))
                .collect(Collectors.toList());
        System.out.println(combineAlphabetAndDigit);


    }
}
