package projecthw8;

import java.util.Scanner;

public class Primevalue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if(n == 1) {
            System.out.println("NO");
            return;
        }

        for(int i=2;i<n;i++) {
            if(n % i == 0) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}