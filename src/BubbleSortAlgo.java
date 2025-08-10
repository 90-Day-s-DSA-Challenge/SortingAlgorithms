import java.util.Arrays;

public class BubbleSortAlgo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

//    Brute Force Approach
    static void bubble(int[] arr){
        boolean swapperd;
//        run the steps n-1 times
        for(int i = 0; i < arr.length; i++){
            swapperd = false;
//            for each steps, max item will come at the last respective index
            for(int j = 1; j < arr.length-i; j++){
//                swap item is smaller than the previous one
                if(arr[j] < arr[j-1]){
//                    swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapperd = true;
                }
            }

//            if you did not swap for a particular value of i, it means the array is sorted and stop the program

            if(!swapperd){
                break;
            }
        }
    }
}
