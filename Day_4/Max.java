package Day_4;
import java.util.Scanner;
public class Max{
    static int max(int[] a){
        int m = 0;
        for(int i:a){
            if(m<i){
                m=i;
            }
        }
        return m;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0;i<n;i++){
            System.out.println("enter the value at index "+(i+1));
            array[i]=sc.nextInt();
        }
        System.out.println("Its max is:"+max(array));
    }
}