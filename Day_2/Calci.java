package Day_2;
import java.util.Scanner;
public class Calci {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter first number");
        int a=s.nextInt();
        System.out.println("enter second number");
        int b=s.nextInt();
        int c=0;
        System.out.println("enter + ,- ,* ,/ ");
        char f=s.next().charAt(0);
        switch(f){
            case '*' -> c=a*b;
            case '+' -> c=a+b;
            case '-' -> c=a-b;
            case '/' -> c=a/b;
            default -> c=0;              

        }
        System.out.println(c);

    }
}
