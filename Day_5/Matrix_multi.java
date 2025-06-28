package Day_5;
import java.util.Scanner;
public class Matrix_multi{
    static int[][] multi(int a[][],int b[][]){
        int n = a.length;
        int s = b[0].length;
        int[][] c = new int[n][s];
        for(int i=0;i<a.length;i++){
            for(int j =0 ; j<b[0].length;j++){
                for(int k = 0;k<a[0].length;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        return c;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of rows first matrix");
        int n = s.nextInt();
        System.out.println("enter the number of columns first matrix");
        int f = s.nextInt();
        System.out.println("enter the number of rows second matrix");
        int q = s.nextInt();
        System.out.println("enter the number of columns second matrix");
        int w = s.nextInt();
        if(f!=q){
            System.out.println("invalid");
        }
        else{
            int[][] a= new int[n][f];
            int[][] b=new int[q][w];
            for(int i = 0;i<n;i++){
                for(int j = 0;j<f;j++){
                    a[i][j]=s.nextInt();
                }
            }
            for(int i = 0;i<q;i++){
                for(int j = 0;j<w;j++){
                    b[i][j]=s.nextInt();
                }
            }
        
            int[][] c =multi(a,b);
            for(int i =0 ;i<c.length;i++){
                for(int j=0;j<c[0].length;j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println(" ");
            }  
        }
        
        s.close();
    }
}
