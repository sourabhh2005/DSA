import java.util.*;

public class selection_sort {
    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 1, 3 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
