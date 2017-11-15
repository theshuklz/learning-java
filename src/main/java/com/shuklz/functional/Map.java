package com.shuklz.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map {
    public static void main(String args[]) {
        List<Integer> nums = Arrays.asList(1, 2, 3);
        System.out.println(map(nums, i -> i * 2));
    }

    private static List<Integer> map(List<Integer> input, Function fun) {
        List<Integer> out = new ArrayList<>();
        for (Integer num : input) {
            out.add(fun.apply(num));
        }
        return out;
    }

    public interface Function {
        Integer apply(Integer val);
    }
}
