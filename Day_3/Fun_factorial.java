package Day_3;

import java.util.Scanner;

class factorial {
    int factorial_num(int n) {
        int c = 0;
        if (n <= 1) {
            c = 1;
        } else {
            c = n * factorial_num(n - 1);
        }
        return c;
    }
}

public class Fun_factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        factorial s = new factorial();
        System.out.println("enter a number");
        int a = scan.nextInt();
        System.out.println("Its factorial: " + s.factorial_num(a));
    }
}