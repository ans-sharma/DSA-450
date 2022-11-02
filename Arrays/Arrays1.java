import java.util.Arrays;

// 2022-11-02 11:15:29
// Reverse the array 
public class Arrays1 {
    public static void main(String[] args) {
        int arr[] = new int[] { 7, 5, 6, 21, 8, 6 };
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[(arr.length-1) - i];
            arr[(arr.length-1) - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
