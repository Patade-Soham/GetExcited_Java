import java.util.Scanner;

public class OddEvens{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is EVEN.");
        }
        else{
            System.out.println(num+" is ODD");
        }
        sc.close();



    }

    
}
