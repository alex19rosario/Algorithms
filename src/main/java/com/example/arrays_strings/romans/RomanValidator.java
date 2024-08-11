package com.example.arrays_strings.romans;

import java.util.function.Predicate;

public class RomanValidator {
    private Predicate<String> isLengthValid = r -> r.length() > 0 && r.length() <= 15;
    private Predicate<String> isWithinValidRange = r -> r.matches("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
    public boolean isValidRoman(String roman) {
        return isLengthValid.and(isWithinValidRange).test(roman);
    }
}
