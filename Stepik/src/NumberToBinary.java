import java.util.Scanner;

public class NumberToBinary {
  public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    String binary = "";
     int a = in.nextInt();
      while (a > 0) {
        binary = a % 2 + binary;
        a /= 2;
      }
        System.out.println(binary);
  }
}

