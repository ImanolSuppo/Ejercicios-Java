package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Stdin & Stdout 2!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.nextLine();
        String variableDoble= scan.nextLine();
        variableDoble=variableDoble.replace(",",".");
        double d = Double.parseDouble(variableDoble);
        String s = scan.nextLine();
        scan.close();

        System.out.println("String: "+ s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }
}
