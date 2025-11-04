package com.example.customcollections.task5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Task5 {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> it1 = first.iterator();
        Iterator<T> it2 = second.iterator();

        Iterator<T> zipIterator = new Iterator<>() {
            private boolean pickFirst = true;

            @Override
            public boolean hasNext() {
                return it1.hasNext() && it2.hasNext();
            }

            @Override
            public T next() {
                if (!hasNext()) throw new NoSuchElementException();
                T result;
                if (pickFirst) {
                    result = it1.next();
                } else {
                    result = it2.next();
                }
                pickFirst = !pickFirst;
                return result;
            }
        };

        return StreamSupport.stream(
                Spliterators.spliteratorUnknownSize(zipIterator, 0),
                false
        );
    }
}