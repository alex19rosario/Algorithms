package com.example.arrays_strings;

import java.util.stream.IntStream;

public class DistinctWays {
    public Long findNumberOfWays(int total, int cost1, int cost2) {
        final int maxAmountOfPens = total / cost1;

        return IntStream.range(0, maxAmountOfPens + 1)
                .mapToLong(i -> ((total - (i * cost1)) / cost2) + 1)
                .sum();
    }
}
