import java.util.*;

class Solution {
    public static void pancakeSort(int[] inputArray) {
        // we want to take the 2nd last index

        // we start with the largest element of the array

        //
        int end = inputArray.length - 1;
        boolean result = false;

        do {
            result = false;
            for (int i = 0; i < end; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    int temp = inputArray[i];
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = temp;
                    result = true;
                }
            }
            end--;
        } while (result);

        System.out.println("After sort: " + Arrays.toString(inputArray));
    }

   /* private static int find(int[] A, int target) {

    }
    private static void flip(int[] A, int index) {

    } */

    public static void main(String[] args){
        int[] arr = {3,2,4,1};
        pancakeSort(arr);
    }
}
