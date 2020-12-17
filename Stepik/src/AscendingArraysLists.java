import java.util.Arrays;
import java.util.Scanner;

public class AscendingArraysLists {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = in.nextInt();
    }
    String list = "" + a[0];

    for (int i = 1; i < n; i++) {

      if (a[i] > a[i - 1]) {
        list = list + a[i];
      } else {
        list = list + "-" + a[i];
      }
    }
    int length = 0;
    String [] strings = list.split("-");
    String arrays = Arrays.toString(strings);
    for (String line : strings) {
      if (line.length()>length) {
        length = line.length();
      }

    }

    System.out.println(length);
    for (String line : strings) {
      String number = "";
      if (line.length()==length) {
        char [] numbers = line.toCharArray();
        for(int i = 0; i < numbers.length; i++) {
           number = number + numbers[i] + " ";
        }
        System.out.println(number);
      }
    }

  }
}

