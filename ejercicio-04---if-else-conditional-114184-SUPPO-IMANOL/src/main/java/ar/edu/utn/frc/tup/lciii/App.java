package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * if - else Conditional!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(n % 2 != 0)
            System.out.print("Weird" + System.lineSeparator());
        else if (n>=2 && n<= 5)
            System.out.print("Not Weird" + System.lineSeparator());
        else if (n>=6 && n<=20)
            System.out.print("Weird" + System.lineSeparator());
        else if (n>20)
            System.out.print("Not Weird" + System.lineSeparator());

        scanner.close();
    }
}
