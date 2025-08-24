import java.util.Arrays;

public class CyclicSortAlgo {
//    Used when array is in range of 1 to n.

    /**
     Tips:
     1. If Range => [0, N]
        then => every element will be in index = value

     2. If Range => [1, N]
        then => every element will be at index = value-1
     */
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        cyclicSort(arr);

        System.out.println(Arrays.toString(arr));

    }

//    arr =   3, 1, 5, 4, 2
//    index = 0, 1, 2, 3, 4

    /**
     Step 1: i = 0

     arr[0] = 3

     correctVal = 3 - 1 = 2

     arr[0] != arr[2] (3 ≠ 5) → swap arr[0] with arr[2].

     arr = [5, 1, 3, 4, 2]

----------------------------------------------------------------------

     Step 2: i = 0 again (we don’t increment i yet)

     arr[0] = 5

     correctVal = 5 - 1 = 4

     arr[0] != arr[4] (5 ≠ 2) → swap.

     arr = [2, 1, 3, 4, 5]
---------------------------------------------------------------------
     Step 3: i = 0 again (we don’t increment i yet)

     arr[0] = 2

     correctVal = 2 - 1 = 1

     arr[0] != arr[1] (2 ≠ 1) → swap.

     arr = [1, 2, 3, 4, 5]
--------------------------------------------------------------------
     Step 4: i = 0 again (we don’t increment i yet)

     arr[0] = 1

     correctVal = 1 - 1 = 0

     arr[0] != arr[0] (1 = 1) → increment i

-------------------------------------------------------------------
     step 5: i = 1
     arr[1] = 2
     correctVal = 2 - 1 = 1

     arr[1] != arr[1] (2 = 2) -> increment i



     */
    public static void cyclicSort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctVal = arr[i]-1;
            if(arr[i] != arr[correctVal]){
//                swap
                swap(arr, i, correctVal);
            }else{
//                if same increase the counter
                i++;
            }
        }
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
