package Day_5;
import java.util.Scanner;
public class Bubble_sort{
    static int[] sort(int[] a){
        int n =a.length;
        for(int i =0;i<n-1;i++){
            for(int j =0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n =s.nextInt();
        int a[] = new int[n];
        for(int i =0;i<n;i++){
            System.out.println("enter the number at index "+i);
            a[i]=s.nextInt();
        }
        sort(a);
        System.out.println("the sorted array");
        for(int b:a){
            System.out.print(b+" ");
        }
        s.close();   
    }
}