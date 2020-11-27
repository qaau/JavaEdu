import java.util.Scanner;

public class SumOfNumberComp {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int a = in.nextInt(), count = 1, sum = 0;
    while (count <= a) {
      sum += count;
      count++;
    }
    System.out.println(sum);
  }
}
