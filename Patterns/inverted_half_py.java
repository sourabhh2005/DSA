import java.util.*;

public class inverted_half_py {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int n = sc.nextInt();

    for (int i = n; i >= 1; i--) { // loop starts from n down to 1
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    sc.close();
  }
}
