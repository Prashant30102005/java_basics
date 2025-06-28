package Day_5;
import java.util.Scanner;
public class Selection_sort{
    static int[] sort(int[] a){
        int n =a.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp =a[i];
            a[i]=a[min];
            a[min]=temp;
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