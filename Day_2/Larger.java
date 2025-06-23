package Day_2;

import java.util.Scanner;

public class Larger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter first number");
        int a = s.nextInt();
        System.out.println("enter second number");
        int b = s.nextInt();
        System.out.println("enter third number");
        int c = s.nextInt();
        if (a > b && a > c) {
            System.out.println("First is largest");
        } else if (b > c && b > a) {
            System.out.println("Second is largest");
        } else {
            System.out.println("Third is largest");
        }
    }
}