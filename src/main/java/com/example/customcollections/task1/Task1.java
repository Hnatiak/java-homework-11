package com.example.customcollections.task1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {
    public static String oddIndexedNames(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 == 1)
                .mapToObj(i -> i + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Maria", "Peter", "Anna");
        System.out.println(oddIndexedNames(names)); // 1. Maria, 3. Anna
    }
}