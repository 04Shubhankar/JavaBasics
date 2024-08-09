import java.util.Scanner;

public class prime {  
  public static void main(String[] args) {
    int flag = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");

    int num = scanner.nextInt();

    System.out.println("Number entered is: " + num);

    if (num <= 2) {
      System.out.println("Enter a number greater than two");
    } 
    
    else {
      for (int i = 2; i < num / 2; i++) {
        if (num % i == 0) {
          flag = 1;  
          break;     
        }
      }
    }

    if (flag == 1) {
      System.out.println(num + " is not a prime number");
    } else {
      System.out.println(num + " is a prime number");
    }

    scanner.close();
  }
}
