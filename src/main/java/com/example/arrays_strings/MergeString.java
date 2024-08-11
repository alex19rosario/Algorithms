package com.example.arrays_strings;

import java.util.stream.IntStream;


public class MergeString {
    public String mergeAlternately(String word1, String word2){

        int minLength = Math.min(word1.length(), word2.length());
        StringBuilder result = new StringBuilder(word1.length() + word2.length());
        IntStream.range(0, minLength).forEach(i -> {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        });
        switch (Integer.compare(word1.length(), word2.length())) {
            case 1 -> result.append(word1.substring(minLength)); // word1 is longer
            case -1 -> result.append(word2.substring(minLength)); // word2 is longer
            // No default case needed as 0 means they are of the same length, so no action is required
        }
        return result.toString();
    }
}
