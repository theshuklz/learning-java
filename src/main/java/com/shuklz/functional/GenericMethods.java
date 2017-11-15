package com.shuklz.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethods {
    public static void main(String args[]) {
        List<Integer> nums = Arrays.asList(1, 2, 3);
        System.out.println(map(nums, i -> i * 2));
        System.out.println(filter(nums, i -> i % 2 == 0));
    }

    private static <T, R> List<R> map(List<T> input, Function<T, R> fun) {
        List<R> out = new ArrayList<>();
        for (T num : input) {
            out.add(fun.apply(num));
        }
        return out;
    }

    private static <T> List<T> filter(List<T> input, Predicate<T> predicate) {
        List<T> out = new ArrayList<>();
        for (T val : input) {
            if (predicate.test(val))
                out.add(val);
        }
        return out;
    }

    public interface Function<T, R> {
        R apply(T val);
    }

    public interface Predicate<T> {
        Boolean test(T val);
    }

}
