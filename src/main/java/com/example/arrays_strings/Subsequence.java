package com.example.arrays_strings;

public class Subsequence {
    public boolean isSubsequence(String s, String t) {
        int sArrayIterator = 0;
        if(s.isEmpty()) //Empty set is within any given set
            return true;
        for (char ch: t.toCharArray()){
            if(Character.toLowerCase(s.charAt(sArrayIterator)) == Character.toLowerCase(ch)){
                sArrayIterator++;
                if(sArrayIterator == s.length())
                    return true;
            }
        }
        return  false;
    }
}
