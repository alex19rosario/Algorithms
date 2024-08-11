package com.example.arrays_strings.romans;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;

public class RomanToInteger {

    private final RomanValidator romanValidator;

    public RomanToInteger(RomanValidator romanValidator){
        this.romanValidator = romanValidator;
    }
    public int romanToInt(String roman) throws InvalidRomanException {

        if(!romanValidator.isValidRoman(roman))
            throw new InvalidRomanException("Invalid Roman Number");

        BiFunction<Integer, Character, Integer> convertRomanToInt = (a, b) -> {
            final int current = Roman.valueOf(String.valueOf(b)).getInt();
            if(a % 1000 == 100 && current > 100)
                return a + current - 200;
            else if(a % 100 == 10 && current > 10)
                return a + current - 20;
            else if(a % 10 == 1 && current > 1)
                return a + current - 2;
            else return a + current;
        };

        return roman.chars()
            .mapToObj(ch -> (char) ch)
            .reduce(0, (acc, ch) -> convertRomanToInt.apply(acc, ch), Integer::sum)
            .intValue();
    }
}
