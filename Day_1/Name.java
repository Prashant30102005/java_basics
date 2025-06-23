package Day_1;
import java.util.Scanner;
public class Name {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = s.nextLine();
        System.out.println("Enter your age:");
        int age = s.nextInt();
        System.out.println("Name: "+name+"\nage: "+age);
        
    }
}
