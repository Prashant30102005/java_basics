package Day_2;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int temp ;
        System.out.println("enter the size of series");
        int n = s.nextInt();
        for(int i=0;i<=n ; i++){
            System.out.print(a+" ");
            temp=b;
            b=a+b;
            a=temp;
        }    
    

    }
}

        