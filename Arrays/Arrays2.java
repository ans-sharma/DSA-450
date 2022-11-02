import java.util.Arrays;

// 2022-11-02 11:28:22
// Find the maximum and minimum element in an array
public class Arrays2 {
    public static void main(String[] args) {
        int arr[] = new int[] { 7, 5, 6, 21, 8, 6 };
        System.out.println(Arrays.toString(arr));
        int minVal = arr[0], maxVal = arr[0];
        for (int i : arr) {
            if(i<minVal)
                minVal = i;
            if(i>maxVal)
                maxVal = i;
        }
        System.out.println("Maximum Value: " + maxVal + ", Minimum Value: " + minVal);
    }
}
