package com.example.arrays_strings;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;

public class MergeString {
    public CompletableFuture<String> mergeAlternately(String word1, String word2){

        return CompletableFuture.supplyAsync(() -> {
            int minLength = Math.min(word1.length(), word2.length());
            StringBuilder result = new StringBuilder(word1.length() + word2.length());
            for(int i = 0; i < minLength; i++){
                result.append(word1.charAt(i));
                result.append(word2.charAt(i));
            }
            if (word1.length() > word2.length()) {
                result.append(word1.substring(minLength));
            } else if (word2.length() > word1.length()) {
                result.append(word2.substring(minLength));
            }
            return result.toString();
        });
    }
}
