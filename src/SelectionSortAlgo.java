import java.util.Arrays;

// find max val in array
// swap max val to last index
// lastIndex will be [arr.length - i -1]
public class SelectionSortAlgo {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};

        System.out.println(Arrays.toString(selectionSort(arr)));

    }

    public static int[] selectionSort(int[] arr){
        for(int i = 0; i< arr.length; i++){
            int last = arr.length - i - 1;
//            find max index
            int max = findMaxIndex(arr, 0, last);

            swap(arr, max, last);
        }
        return arr;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int findMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for(int i = 0; i <= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }

        return max;
    }


}
