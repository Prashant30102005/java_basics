package Day_5;
import java.util.Scanner;
public class Binary_search{
    static int search(int a[],int b){
        int n = a.length;
        int start = 0;
        int end = n-1;
        while(start<=end){
            int key =(start+end)/2;
            if(a[key]<b){
                start=key+1;
            }
            else if(a[key]>b){
                end=key-1;
            }
            else if(a[key]==b){
                return key;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the value at index "+i);
            a[i]=s.nextInt();
        }
        System.out.println("enter the value for searching");
        int k = s.nextInt();
        int q = search(a,k);
        if(q!=-1){
            System.out.println("Element found at index "+q);
        }
        else{
            System.out.println("element not found");
        }
        s.close();
    }
}