package Day_1;
import java.util.Scanner;
public class Swap{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        int a =s.nextInt();
        System.out.println("Enter second number");
        int b =s.nextInt();
        int temp = a;
        a=b;
        b=temp;
        System.out.println("the first number: "+a);
        System.out.println("the second number: "+b);
    
    }    
}
