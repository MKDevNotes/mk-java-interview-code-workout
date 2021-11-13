package org.dn.interview.snippet;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySumValue {
    public static void main(String[] args) {
        Integer[] numberArray = { 1, 42, 23, 14, 5, 37, 18, 9, 10};
        Integer sum = Arrays.stream(numberArray).mapToInt(Integer::intValue).sum();
        System.out.println(" Find Sum of Array "+sum);
        Integer avarage = sum / numberArray.length; // Normal Calculation.
        System.out.println(" Find Avarage "+avarage);
        System.out.println(" Find Average "+Arrays.stream(numberArray).mapToInt(Integer::intValue).average().orElse(Double.NaN));
    }
}
