package questions;

import java.util.Arrays;

public class FindTheDuplicateNumber {
//    https://leetcode.com/problems/find-the-duplicate-number/description/
//    287. Find the Duplicate Number
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(nums));

    }

    public static int findDuplicate(int[] nums) {
        // initial
        int i = 0;

        // loop till array length
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                // current val
                int currentVal = nums[i] - 1; // because range start from [1, N]

                if (nums[i] != nums[currentVal]) {
                    // swap
                    swap(nums, i, currentVal);
                } else {
                    return nums[i]; // found duplicate
                }

            }else{
                // increament i
                i++;
            }

        }


        return -1;
    }

    // swap
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
