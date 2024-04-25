package projecthw8;

import java.util.Scanner;

public class ImageOfTringle {
    public static void main(String[] args)

    {
        int a,j,n;
        System.out.print("Enter number of rows : ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        for(a=1;a<=n;a++)
       {
           for(j=1;j<=a;j++) {
                System.out.print(j);
            }

           System.out.println();
        }
    }
}

