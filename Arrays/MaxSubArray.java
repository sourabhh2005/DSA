public class MaxSubArray {

  public static void maxSubArrayKadane(int[] arr) {
    int currSum = arr[0];
    int maxSum = arr[0];

    for (int i = 1; i < arr.length; i++) {
      currSum = Math.max(arr[i], currSum + arr[i]); //  this is the core logic of Kadane's Algorithm,
      maxSum = Math.max(maxSum, currSum);
    }

    System.out.println("Max subarray sum is: " + maxSum);
  }

  public static void main(String[] args) {
    int[] arr = { 1, -2, 3, 4, -5, 8, -1, 2 };
    maxSubArrayKadane(arr);
  }
}
