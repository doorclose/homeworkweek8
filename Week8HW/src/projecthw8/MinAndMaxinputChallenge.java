package projecthw8;

import java.util.Scanner;

public class MinAndMaxinputChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Enter number: ");
            if (scan.hasNextInt()) {
                int number = scan.nextInt();
                min = Math.min(min, number);
                max = Math.max(max, number);
            } else {
                break;
            }
            scan.nextLine();
        }

        System.out.println("Minimum number entered: " + min);
        System.out.println("Maximum number entered: " + max);
        scan.close();
    }
}






