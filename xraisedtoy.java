import java.util.Scanner;

public class xraisedtoy {  
  public static void main(String[] args) {
    int ans = 1;
    Scanner scannerx = new Scanner(System.in);
    Scanner scannery = new Scanner(System.in);
    System.out.println("Enter Number X and Y for X^Y");
    System.out.print("Enter Number X ");
    int x = scannerx.nextInt();
    
    System.out.print("Enter Number Y ");
    int y = scannery.nextInt();
    int orgy = y;

    System.out.println("Number X and Y entered are : " + x+  ", " + y);
    
    while(y!=0){
    	ans = ans*x;
    	y--;
    }
    
    
    System.out.println(x+" Raised to "+ orgy+" is  : " + ans);

   

    scannerx.close();
    scannery.close();
  }
}

