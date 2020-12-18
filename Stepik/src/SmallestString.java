import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SmallestString {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String text = in.nextLine();
    String [] word = text.split(" ");
    String arrays = Arrays.toString(word);



    String a = word[0];
    String b = word[1];
    if (a.compareTo(b) > b.compareTo(a)) {
      System.out.println(a);
    } else {
      System.out.println(b);
    }
    System.out.println(arrays);
  }
}
