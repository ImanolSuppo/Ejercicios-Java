package ar.edu.utn.frc.tup.lciii;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Hello Map!
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
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
        Scanner scn = new Scanner(System.in);
        Map<String, Integer> lineasTelefonicas = new HashMap<String, Integer>();
        String clave;
        Integer valor;
        String buscarClave;
        String claveConseguida;
        int cantidadTelefonos = scn.nextInt();
        for (int i = 0; i < cantidadTelefonos; i++) {
            scn.nextLine();
            clave = scn.nextLine();
            valor = scn.nextInt();
            lineasTelefonicas.put(clave,valor);
        }
        scn.nextLine();
        while (scn.hasNextLine()){
            buscarClave= scn.nextLine();
            if (lineasTelefonicas.get(buscarClave) == null)
                claveConseguida = "Not found";
            else
                claveConseguida = buscarClave + "=" + lineasTelefonicas.get(buscarClave).toString();
            System.out.print(claveConseguida + System.lineSeparator());
        }
    }
}
