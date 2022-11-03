import java.util.Arrays;

// 2022-11-02 11:35:01
// Find the “Kth” max and min element of an array, It is given that all array elements are distinct.
public class Arrays3 {
    public static void withSorting(int[] arr, int k){
        Arrays.sort(arr);
        System.out.println(k + "th, maximum no. is: " + arr[k]);
    }
    public static void main(String[] args) {
        int arr[] = new int[] { 7, 5, 6, 21, 8 };
        int k = 2;
        if (k < 0 || k > arr.length - 1)
            System.out.println("Invalid value of K");
        System.out.println(Arrays.toString(arr));
        withSorting(arr, k);
    }
}
