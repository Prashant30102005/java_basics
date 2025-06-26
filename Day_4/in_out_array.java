package Day_4;
import java.util.*;
public class in_out_array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            System.out.println("enter the value at "+(i+1));
            a[i]=sc.nextInt();
        }
        System.out.println("the array");
        for(int b:a){
            System.out.print(b+"  ");
        }
        sc.close();
    }
}