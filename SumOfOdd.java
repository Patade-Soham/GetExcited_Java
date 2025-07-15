import java.util.Scanner;

public class SumOfOdd {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Starting number : ");
    int start=sc.nextInt();

    System.out.print("Enter ending number : ");
    int end=sc.nextInt();

    int sum=0;


    for(int i = start;i<=end;i++){
        if(i%2!=0){
            sum+=i;
        }
    
    }

    System.out.println("Sum of odd numbers from "+start+" and "+end+" is "+sum);

}
    




    
}
