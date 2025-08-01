import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its factoiral :");
        int num = sc.nextInt();
        int res = 1;
        for(int i=num; i>=1;i--){
            res=res*i;


        }
        System.out.println("The Factorial of "+num+" is "+res);
        sc.close();

    }
    
}
