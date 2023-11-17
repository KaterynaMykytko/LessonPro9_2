package org.courses.ex9_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList {

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int value = random.nextInt(10);
            values.add(value);
        }
        int sum = values
                .stream()
                .mapToInt(v -> v * v)
                .reduce(0, (v1,v2) -> v1 + v2);
        System.out.println(sum);
    }
}
