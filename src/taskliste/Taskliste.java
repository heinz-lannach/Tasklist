/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskliste;

import java.util.InputMismatchException;
import java.util.LinkedList;
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
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Einkaufen");
        tasks.add("Vignette");
        tasks.add("Putzen");
        while (true)
        {
            // TODO code application logic here
            // System.out.println("hello world");
         //   System.out.println("Task 1");
         //   System.out.println("Task 2");
         
            int i = 1;
            for(String element : tasks)
            {
                System.out.println(i + " " + element);
                i = i + 1;
            }
            System.out.println("");
            System.out.println("");
            System.out.println("0 .... Programm beenden");
            System.out.print("geben sie 1 oder 2 (als Zahl) ein!:");

            try
            {
              int He_eingabe1 = new Scanner(System.in).nextInt();
                if (He_eingabe1 == 0)
                {
                    System.out.println("Programm beendet");
                    return;
                }
                else if (He_eingabe1 < 1 || He_eingabe1 > 2)
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
