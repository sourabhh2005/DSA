public class butterfly {

  public static void main(String[] args) {
    int n = 4;

    for (int i = 1; i <= 2 * n; i++) {
      int row = i <= n ? i : 2 * n - i;

      // Left stars
      for (int j = 1; j <= row; j++) {
        System.out.print("* ");
      }

      // Middle spaces
      for (int j = 1; j <= (2 * n) - (2 * row); j++) {
        System.out.print("  ");
      }

      // Right stars
      for (int j = 1; j <= row; j++) {
        System.out.print("* ");
      }

      System.out.println();
    }
  }
}
