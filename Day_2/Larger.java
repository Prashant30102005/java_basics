import java.util.Scanner;
public class Larger {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a =s.nextInt();
        int b =s.nextInt();
        int c =s.nextInt();
        
        
        if (a>b&&a>c){
            System.out.println("A is largest");
        }
        else if(b>c&&b>a){
            System.out.println("b is largest");
        }
        else{
            System.out.println("c is largest");
        }

    }
}
