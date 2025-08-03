import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word to check if it is palindrome or not : ");
        String word=sc.nextLine();
        String rev = "";
        for(int i = word.length() - 1;i>=0;i--){
            rev = rev + word.charAt(i);
            System.err.println(rev);

        }
        if(word==rev){
            System.out.println(word+ " is a Palindrome. ");
        }
        else
        {
            System.out.println(word+" is not a Palindrome.");
        }

        
    }
}
