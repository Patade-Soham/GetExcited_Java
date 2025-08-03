import java.util.Scanner;
public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word : ");
        String word=sc.nextLine();
        int vowels=0;
        for(int i = word.length()-1;i>=0;i--){
            if(word.charAt(i)=='a'|| word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u' ){
                vowels+=1;

            }

        }
        System.out.println(word+" has "+vowels+" vowels and "+(word.length()-vowels)+" consonants.");
        sc.close();
    }
}
