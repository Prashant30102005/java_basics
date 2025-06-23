package Day_2;
import java.util.Scanner;
public class Palindrom{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = s.nextInt();
        int r = 0;
        int rev=0;
        while(n!=0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        
        System.out.println("Its palindrome: "+rev);
    }
}