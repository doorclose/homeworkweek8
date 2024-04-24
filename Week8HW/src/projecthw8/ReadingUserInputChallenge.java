package projecthw8;

import java.util.Scanner;

import static java.util.Scanner.*;

public class ReadingUserInputChallenge {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int count = 1;
            int sum = 0;

            while (count <= 10) {
                System.out.println("Enter number " + count);
                if (scan.hasNextInt()) {
                    int number = scan.nextInt();
                    sum += number;
                    count++;
                } else {
                    System.out.println("Invalid number  ");
                    scan.next();

                }

            }
            System.out.println("Sum of 10 numbers :-> " +sum);
            scan.close();
        }
    }
