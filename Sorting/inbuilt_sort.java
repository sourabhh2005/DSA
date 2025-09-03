import java.util.*;

public class inbuilt_sort {
    public static void main(String[] args) {
        Integer arr[] = { 2, 5, 3, 1, 4 };
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
