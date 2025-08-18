public class binary_serch {

  public static int bin_ser(int num[], int key) {
    int start = 0;
    int end = num.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;

      if (key == num[mid]) {
        return mid;
      }
      if (num[mid] < key) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int num[] = { 1, 22, 3, 30, 34, 10 };
    int key = 10;
    System.out.println(bin_ser(num, key));
  }
}
