import java.util.Arrays;

public class InsertionSortAlgo {
    public static void main(String[] args) {
        int[] arr = {11, 2, 7, 5, 1};
        System.out.println(Arrays.toString(insertionSort(arr)));

    }

    public static int[] insertionSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }else{
//                    if j-1 is less than j then break the loop
                    break;
                }
            }
        }

        return arr;
    }

    //    swap max val to last index
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
