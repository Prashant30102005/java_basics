package Day_2;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String q = "yes";
        do{
            System.out.println("enter first number");
            int a=s.nextInt();
            System.out.println("enter second number");
            int b=s.nextInt();
            System.out.println("enter + ,- ,* ,/ ");
            char f=s.next().charAt(0);
            switch(f){
                case '*' -> System.out.println("the multiple is "+(a*b));
                case '+' -> System.out.println("the sum is "+(a+b));
                case '-' -> System.out.println("the sub is "+(a-b));
                case '/' -> System.out.println("the division is "+(a/b));
                default -> System.out.println("invalid choice"); 
            }
            System.out.println("wat to continue type \"yes\"");
            q= s.next();
            

        }while(q=="yes");
        

    }
}
