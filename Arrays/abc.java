public class abc {

  public static void printArray(int arr[]) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    System.out.println("Max: " + max);
    System.out.println("Min: " + min);
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    printArray(arr);
  }
}
