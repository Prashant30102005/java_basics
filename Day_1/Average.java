package Day_1;
import java.util.Scanner;;

public class Average {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = s.nextInt();
        System.out.println("Enter Second number: ");
        int b = s.nextInt();
        System.out.println("Enter third number: ");
        int c = s.nextInt();
        float avg = (float) ((a + b + c) / 3);
        System.out.println("the average: " + avg);

    }
}
