import java.util.Arrays;

// 2022-11-03 10:53:28
// Move all the negative elements to one side of the array
public class Arrays5 {
    public static void main(String[] args) {
        int arr[] = new int[] { 2, 0, -1, -1, 0, 1, -2, 0, 0 };
        System.out.println(Arrays.toString(arr));
        int ptr = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i] < 0){
                int temp = arr[i];
                arr[i] = arr[ptr];
                arr[ptr] = temp;
                ptr++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
