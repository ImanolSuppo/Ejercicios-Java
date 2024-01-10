package ar.edu.utn.frc.tup.lciii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Hello List!
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
        List<Integer> l = new ArrayList<>();
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            l.add(scn.nextInt());
        }
        int q = scn.nextInt();
        String query;

        for (int i = 0; i < q; i++) {
            scn.nextLine();
            query = scn.nextLine();
            if (query.equals("Insert")) { //el nextLine me devuelve un ""
                l.add(scn.nextInt(), scn.nextInt());
            } else if (query.equals("Delete")) { //el nextLine me devuelve un ""
                l.remove(scn.nextInt());
            }
        }
        for (int i = 0; i < l.size(); i++) {
            if (i == l.size()-1)
                System.out.print(l.get(i));
            else
                System.out.print(l.get(i) + " ");
        }
        System.out.print(System.lineSeparator());
    }
}
