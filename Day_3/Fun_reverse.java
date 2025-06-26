package Day_3;
import java.util.Scanner;
class reverse{
    int reverse_num(int n){
        int rev = 0;
        while (n>0){
            int r = n%10;
            rev = rev*10 + r;
            n=n/10;
        }
        return rev;
    }
}
public class Fun_reverse{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        reverse r = new reverse();
        System.out.println("enter a number");
        int a = scan.nextInt();
        System.out.println("its reverse is: "+r.reverse_num(a));
    }
}