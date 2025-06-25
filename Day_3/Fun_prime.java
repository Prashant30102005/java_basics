package Day_3;
import java.util.Scanner;
class Prime{
    boolean prime(int n){
        boolean c = false;
        if (n<=1){
            c= false;
        }
        else{
            for(int i = 2;i<=Math.sqrt(n);i++){
                if (n%i==0){
                    c = false;
                }
                else {
                    c =true;
                }
            }
        }
        return c;
    }
}
public class Fun_prime{
        public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Prime p = new Prime();
        System.out.println("enter a number");
        int a = scan.nextInt();
        System.out.println(p.prime(a)+" it number is prime");
    }
}