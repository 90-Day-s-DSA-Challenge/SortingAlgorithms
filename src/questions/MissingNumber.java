package questions;

public class MissingNumber {
//    in this problem we are using a cyclic sort algo because we found a range in question
//    asked in amazon.

    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};

        System.out.println(missingNumber(nums));

    }

    public static int missingNumber(int[] arr){
        int i = 0;

//        run a while loop, till length of array
        while(i < arr.length){
//            create current val for comparing values.
            int currentVal = arr[i];

            if(arr[i] < arr.length && arr[i] != arr[currentVal]){
//                swap value
                swap(arr, i, currentVal);
            }else{
//                increment i
                i++;
            }
        }

//        CASE 01:
//        searching first missing value
        for (int j = 0; j < arr.length; j++) {
//            if index != arr[index], return that index
            if(arr[j] != j){
                return j;
            }

        }

//        CASE 02: return length of array
        return arr.length;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
