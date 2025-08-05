public class TrappingRainWater {

  public static int waterTrapped(int[] height) {
    int n = height.length;
    int left = 0, right = n - 1;
    int leftMax = 0, rightMax = 0;
    int trappedWater = 0;

    while (left < right) {
      if (height[left] < height[right]) {
        if (height[left] >= leftMax) {
          leftMax = height[left];
        } else {
          trappedWater += leftMax - height[left];
        }
        left++;
      } else {
        if (height[right] >= rightMax) {
          rightMax = height[right];
        } else {
          trappedWater += rightMax - height[right];
        }
        right--;
      }
    }

    return trappedWater;
  }

  public static void main(String[] args) {
    int[] arr = {4, 2, 6, 8, 3};
    int result = waterTrapped(arr);
    System.out.println("Total water trapped: " + result);
  }
}
