package org.dn.interview.snippet.array;

import static java.util.Arrays.stream;

import java.util.Arrays;

/**
 * This is Code snippet for find Missing Number
 * @author muthukumar thangavinayagam
 * @Date 13/Nov/2021
 */

public class ArrayMissingNumber {
    public static void main(String[] args) {
        Integer[] numberArray = { 1, 2, 3, 4, 5, 7, 8, 9, 10};
        ArrayMissingNumber.getMissingNumber(numberArray , 10); // 10 is last digit of missing number.
    }

    public static void getMissingNumber(Integer[] numberArray,int inputlenght) {
        int sum = 0;
        int sumOfArray = Arrays.stream(numberArray).mapToInt(Integer::intValue).sum();
        // [n*(n+1)]/2

        System.out.println(" Sum of Array "+sumOfArray);
        sum = (inputlenght * (inputlenght+1))/2;
        System.out.println(" Sum  "+sum);
        System.out.println(" Missing Number "+ (sum-sumOfArray));
    }
}
