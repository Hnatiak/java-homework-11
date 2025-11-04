package com.example.customcollections.task2;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static List<String> toUpperAndSortDesc(List<String> input) {
        return input.stream()
                .map(String::toUpperCase)
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> input = List.of("1. Maria", "3. Anna");
        System.out.println(toUpperAndSortDesc(input)); // [3. ANNA, 1. MARIA]
    }
}
