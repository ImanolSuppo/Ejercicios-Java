package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

/**
 * Loops & Math 2!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            String concatenacion="";
            int result=a;
            int y = 1;
            for (int x=1; x<=n; x++)
            {
                result= result + (y*b);
                y=y*2;
                concatenacion=concatenacion + result+" ";
            }
            System.out.print(concatenacion.trim());
            System.out.print(System.lineSeparator());
        }
        in.close();
    }
}
