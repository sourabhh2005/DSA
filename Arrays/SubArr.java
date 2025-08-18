public class SubArr {

  public static void subArrays(int arr[]) {
    int curr_max = arr[0], maxSum = arr[0];
    int curr_min = arr[0], minSum = arr[0];

    for (int i = 1; i < arr.length; i++) {
      curr_max = Math.max(arr[i], curr_max + arr[i]);
      maxSum = Math.max(maxSum, curr_max);

      curr_min = Math.min(arr[i], curr_min + arr[i]);
      minSum = Math.min(minSum, curr_min);
    }

    System.out.println("\nMaximum Subarray Sum: " + maxSum);
    System.out.println("Minimum Subarray Sum: " + minSum);
  }

  public static void main(String[] args) {
    int[] arr = { 2, 4, 6, 8, 10 };
    subArrays(arr);
  }
}
