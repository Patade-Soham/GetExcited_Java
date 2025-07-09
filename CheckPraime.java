import java.util.Scanner;

public class CheckPraime {
    public static void main(String[] args) {
        int count =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int num = sc.nextInt();
        for(int i =2 ;i<(num - 1);i++){
            if (num%i==0){
                count=+1;
            }
        }
        if(count == 0){
            System.out.println("prime");
        }else if(count>0){
            System.out.println("Not Prime");
        }
        


    }
    
}
