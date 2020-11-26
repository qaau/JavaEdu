import java.util.Scanner;

public class SearchMinNumber {
  public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    int a = 5;
    int min = (int) 1e9;
    while (in.hasNext()){
      a = in.nextInt();
        if (a < min) min = a;
      }
    in.close();
    System.out.println(min);
    }
  }


