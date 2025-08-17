import java.util.*;

public class Square {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in); // Scanner object created

    System.out.print("Enter the number of rows: ");
    int n = sc.nextInt(); // taking user input

    // Loop for rows
    for (int i = 1; i <= n; i++) {
      // Loop for columns
      for (int j = 1; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println(); // move to next line after each row
    }

    sc.close(); // close Scanner
  }
}
