package questions;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappeardInAnArray {
//    asked in google
//    find all number disappear in an array
//    https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
//    448. Find All Numbers Disappeared in an Array
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println(findDisappearedNumbers(nums));

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;

        // while loop to till length of array
        while(i < nums.length){
            // store initial value
            int currentVal = nums[i]-1;

            // comparing
            if(nums[i] != nums[currentVal]){
                // swap
                swap(nums, i, currentVal);
            }else{
                // increment i;
                i++;
            }
        }

        List<Integer> missingNums = new ArrayList<>();

        // finding missing elements
        for(int j = 0; j < nums.length ; j++){
            // compare with index+1
            if(nums[j] != j+1){
                missingNums.add(j+1);
            }
        }

        return missingNums;

    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
