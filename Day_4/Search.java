package Day_4;
import java.util.Scanner;
public class Search{
    void Search_num(int[] a,int k){
        int n = a.length;
        int s = -1;
        for(int i = 0;i<n;i++){
            if(k==a[i]){
                s=i;
            }
        }
        if(s!=-1){
            System.out.println("element "+k+" found at index "+s);
        }
        else{
            System.out.println("element not found");
        }
    }
    public static void main(String[] args){
        Search s =new Search();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            System.out.println("Enter the value at index "+i);
            arr[i]=sc.nextInt();
        }
        System.out.println("enter value to search in array");
        int z = sc.nextInt();
        s.Search_num(arr,z);
    }    
}