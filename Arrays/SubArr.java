public class SubArr {

  public static void subArrays(int[] arr) {
    int maxSum = Integer.MIN_VALUE;
    int minSum = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) {
      int sum = 0;
      for (int j = i; j < arr.length; j++) {
        sum += arr[j];

        // Print current subarray
        for (int k = i; k <= j; k++) {
          System.out.print(arr[k] + " ");
        }
        System.out.println();

        // Update max and min
        maxSum = Math.max(maxSum, sum);
        minSum = Math.min(minSum, sum);
      }
    }

    System.out.println("\nMaximum Subarray Sum: " + maxSum);
    System.out.println("Minimum Subarray Sum: " + minSum);
  }

  public static void main(String[] args) {
    int[] arr = { 2, 4, 6, 8, 10 };
    subArrays(arr);
  }
}
