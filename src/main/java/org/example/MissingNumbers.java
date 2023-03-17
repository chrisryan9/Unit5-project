package org.example;

import java.util.Arrays;

public class MissingNumbers {
    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 4, 5, 6, 10, 9, 7};
        int maxNum = 10;
        int missing = missingNumber(nums, maxNum);
        System.out.println("the missing number is: " + missing);
    }

    public static int missingNumber(int[] nums, int maxNum) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return maxNum + 1;
    }
}
