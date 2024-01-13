import java.util.Scanner;

public class PrimeNoTillN {
  public static void main(String[] args) {

    try (Scanner scr = new Scanner(System.in)) {
      System.out.println("~~~Prime Numbers till N~~~");
      System.out.println("Enter number:");
      int n=scr.nextInt();
      
      for (int i = 2; i <= n; i++) {
        int count = 0;

        for(int div = 2; div*div <= i; div++){
          if(i%div==0){
            count++;
            break;
          }
        }

        if(count == 0) {
          System.out.println(i);
        }
      }
    }
  }
}