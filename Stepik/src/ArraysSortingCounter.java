import java.util.Scanner;

public class ArraysSortingCounter {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    if (n < 1 || n > 1000) return;
    int[] a = new int[n];
    int count = 0;
    for (int i = 0; i < n; i++) {
      a[i] = in.nextInt();
    }
    for (int j = 0; j < n - 1; j++) {
      if (a[j] > a[j + 1]) count++;
    }
    System.out.println(count);
  }

}
