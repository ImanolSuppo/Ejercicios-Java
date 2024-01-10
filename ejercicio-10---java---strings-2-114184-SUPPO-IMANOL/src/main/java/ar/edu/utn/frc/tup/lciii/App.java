package ar.edu.utn.frc.tup.lciii;

import java.util.Objects;
import java.util.Scanner;

/**
 * Hello Strings 2!
 *
 */
public class App 
{

    /**
     * This is the main program
     * 
     */
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        String a = sc.nextLine(); //Modificado "sc.next()" por "sc.nextLine()"
        System.out.print((isPalindrome(a) ? "Yes" : "No") + System.lineSeparator());
    }

    private static boolean isPalindrome(String a) {
        a = a.toLowerCase().replaceAll("\\s", "");
        int izquierda = 0;
        int derecha = a.length() - 1;
        while (izquierda < derecha) {
            if (a.charAt(izquierda) != a.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }
}
