import java.util.Arrays;

// 2022-11-02 17:57:03
// Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo.

public class Arrays4 {
    public static void main(String[] args) {
        int arr[] = new int[] { 2, 0, 1, 1, 0, 1, 2, 0, 0 };
        System.out.println(Arrays.toString(arr));
        int zeroPtr = 0, onePtr = 0, twoPtr = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == 0){
                // swap 
                int temp = arr[i];
                arr[i] = arr[zeroPtr];
                
                arr[zeroPtr] = temp;

                zeroPtr++;
                onePtr++;
                twoPtr++;
            }
            else if(arr[i] == 1){
                int temp = arr[i];
                arr[i] = arr[onePtr];
                arr[onePtr] = temp;

                onePtr++;
                twoPtr++;
            }
            else if(arr[i] == 2){
                int temp = arr[i];
                arr[i] = arr[twoPtr];
                arr[twoPtr] = temp;

                twoPtr++;
            }
        System.out.println(Arrays.toString(arr) + "i, j, k " + zeroPtr + onePtr + twoPtr);
        }
        // System.out.println(Arrays.toString(arr));
    }
}
