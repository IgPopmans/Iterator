package com.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(23,4,5,8,45,34,78,89));

        for (Integer s : new ReverseIterator<>(integers)) {
            System.out.println(s);
        }
    }
}
