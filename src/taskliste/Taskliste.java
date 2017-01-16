/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskliste;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author bfiwest
 */
public class Taskliste
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int He_eingabe1 = 0;
        while (true)
        {
            // TODO code application logic here
            // System.out.println("hello world");
            System.out.println("Task 1");
            System.out.println("Task 2");
            System.out.println("");
            System.out.println("");
            System.out.println("0 .... Programm beenden");
            System.out.print("geben sie 1 oder 2 (als Zahl) ein!:");

            try
            {
                He_eingabe1 = new Scanner(System.in).nextInt();
                if (He_eingabe1 == 0)
                {
                    System.out.println("Programm beendet");
                    return;
                }
                if (He_eingabe1 < 1 || He_eingabe1 > 2)
                {
                    System.out.println("verbotene Zahl");
                }
                else
                {
                    System.out.println("Sie haben " + He_eingabe1 + " ausgewählt");
                }
            }
            catch (InputMismatchException error) // Variablen definition 
            {
                System.out.println("Das ist keine Zahl!");
            }
        }
    }

}
