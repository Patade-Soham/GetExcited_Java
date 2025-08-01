import java.util.Scanner;
import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the series: ");
        int series_length = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        if (series_length <= 0) {
            System.out.println("Please enter a positive number.");
        } else if (series_length == 1) {
            arr.add(0);
        } else {
            int f = 0;
            int n = 1;
            arr.add(f);
            arr.add(n);
            
            while (arr.size() < series_length) {
                int a = f + n;
                arr.add(a);
                f = n;
                n = a;
            }
        }

        System.out.println("Fibonacci series: " + arr);
        sc.close();
    }
}
