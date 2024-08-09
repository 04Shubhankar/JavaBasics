import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int term = scanner.nextInt();

        System.out.println("Fibonacci Series:");

        // Calculate and print Fibonacci series
        int t1 = 0, t2 = 1;
        System.out.print(t1 + " " + t2 + " ");
        for (int i = 2; i < term; ++i) {
            int sum = t1 + t2;
            System.out.print(sum + " ");
            t1 = t2;
            t2 = sum;
        }

        scanner.close();
    }
}
