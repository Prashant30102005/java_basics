package Day_3;
import java.util.Scanner;
public class Fun_add{
   public int add(int a,int b){
    int c= a+b;
    return c;
   }
    public static void main(String[] args){
        Fun_add s = new Fun_add();
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number:");
        int q = scan.nextInt();
        System.out.println("enter second number:");
        int w = scan.nextInt();
        System.out.println(s.add(q,w));
   } 
}