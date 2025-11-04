package com.example.customcollections.task3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task3 {
    public static String sortNumbers(String[] arr) {
        return Arrays.stream(arr)
                .flatMap(s -> Arrays.stream(s.split(",\\s*")))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        String[] arr = {"1, 2, 0", "4, 5"};
        System.out.println(sortNumbers(arr)); // 0, 1, 2, 4, 5
    }
}
