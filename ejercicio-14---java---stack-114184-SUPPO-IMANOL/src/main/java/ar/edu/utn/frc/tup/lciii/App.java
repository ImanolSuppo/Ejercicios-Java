package ar.edu.utn.frc.tup.lciii;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Hello Stack!
 *
 */
public class App 
{

    /**
     * This is the main program
     * 
     */
    public static void main( String[] args ) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
        Scanner scanner = new Scanner(System.in);
        String cadena;
        while (scanner.hasNextLine()) {
            cadena = scanner.nextLine();
            System.out.print(estaBalanceado(cadena) + System.lineSeparator());
        }
    }

    private static boolean estaBalanceado(String cadena) {
        Stack<Character> stack = new Stack<Character>();
        char letras[] = cadena.toCharArray();
        Stack<Character> bandera = new Stack<Character>();
        if (letras.length % 2 != 0)
            return false;
        else{
            for (int i = 0; i < letras.length; i++) {
                if (letras[i] == '(' || letras[i] == '[' || letras[i] == '{')
                {
                    stack.push(letras[i]);
                    switch (letras[i]) {
                        case '(':
                            bandera.push(')');
                            break;
                        case '[':
                            bandera.push(']');
                            break;
                        case '{':
                            bandera.push('}');
                            break;
                    }
                }
                else if (letras[i] == bandera.lastElement())
                {
                    stack.pop();
                    bandera.pop();
                }
                else
                    return false;
            }
        }
        return true;
    }
}
