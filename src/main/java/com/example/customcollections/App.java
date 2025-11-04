package com.example.customcollections; 

import com.example.customcollections.task1.Task1;
import com.example.customcollections.task2.Task2;
import com.example.customcollections.task3.Task3;
import com.example.customcollections.task4.Task4;
import com.example.customcollections.task5.Task5;

import java.util.List;
import java.util.stream.Stream;
import java.util.Iterator;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        System.out.println("===== Завдання 1 =====");
        List<String> names = List.of("Ivan", "Maria", "Peter", "Anna");
        String oddNames = Task1.oddIndexedNames(names);
        System.out.println(oddNames); // 1. Maria, 3. Anna

        System.out.println("\n===== Завдання 2 =====");
        List<String> sortedUpper = Task2.toUpperAndSortDesc(List.of(oddNames));
        System.out.println(sortedUpper); // [3. ANNA, 1. MARIA]

        System.out.println("\n===== Завдання 3 =====");
        String[] arr = {"1, 2, 0", "4, 5"};
        String sortedNumbers = Task3.sortNumbers(arr);
        System.out.println(sortedNumbers); // 0, 1, 2, 4, 5

        System.out.println("\n===== Завдання 4 =====");
        long a = 25214903917L;
        long c = 11L;
        long m = (1L << 48);
        long seed = System.currentTimeMillis();

        Task4.linearCongruentialGenerator(seed, a, c, m)
                .limit(5)
                .forEach(System.out::println);
        
        System.out.println("\n===== Завдання 5 =====");

        Stream<Integer> s1 = Stream.of(1, 3, 5);
        Stream<Integer> s2 = Stream.of(2, 4, 6);
            
        String zippedString = Task5.zip(s1, s2)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println("Zipped stream: " + zippedString);
    }
}