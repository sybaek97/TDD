package com.tdd;

import java.util.*;


public class TestLotto {
    public static List<Integer> generate() {
        Set<Integer> num = new HashSet<>();
        Random rm = new Random();
        while (num.size() < 6) {
            int number = rm.nextInt(45) + 1;
            num.add(number);
        }
        return new ArrayList<>(num);
    }
}

