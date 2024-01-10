package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Loops & Math 1!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 1; i <= 10; i++)
        {
            System.out.print(""+n+" x "+i+" = "+i*n+System.lineSeparator());
        }
        scanner.close();
    }
}
