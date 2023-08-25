package com.task;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        // the actual sum of the array numbers
        int actualSum = 0;
        // minimum and maximum numbers of the array for calculating the sum of the arithmetic progression
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            actualSum += i;
            if (i < min) min = i;
            if (i > max) max = i;
        }
        // the sum of consecutive numbers from min to max as the sum of the arithmetic progression
        int totalSum = (min + max) * (max - min + 1) / 2;
        if (totalSum == actualSum) {
            // if the sums are equal, then there is no missing number in the array sequence
            // so the first number of the sequence is skipped, or the last if the first number is 0
            return min == 0 ? max + 1 : min -1;
        } else {
            // else the missing number is the difference between
            // the total sum of consecutive numbers from n to m and the actual sum
            return totalSum - actualSum;
        }
    }
}
