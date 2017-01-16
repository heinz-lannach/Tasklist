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
        
            System.out.println("Taskliste");
            System.out.println("");
            System.out.println("1 .... Task auflisten");
            System.out.println("2 .....Task hinzufügen");
            System.out.println("3 .... Task löschen"); 
            System.out.println("4 .....Programm beenden");
            System.out.println("");    
            System.out.print("Bitte Option wählen: "); 
            int option = new Scanner(System.in).nextInt();
        
        
        
        
        while (true)
        {
            // TODO code application logic here
            // System.out.println("hello world");
         //   System.out.println("Task 1");
         //   System.out.println("Task 2");
            System.out.println("Einen Task wählen: ");
            System.out.println(""); 
            int i = 1;
            for(String element : tasks)
            {
                System.out.println(i + " " + element);
                i = i + 1;
            }
            System.out.println("");
            System.out.println("");
            System.out.println("0 .... Programm beenden");
            System.out.println("-1 Task hinzufügen");
            System.out.println("-2 Task löschen");          
            System.out.print("geben sie 1 oder 2 (als Zahl) ein!:");

            try
            {
              int He_eingabe1 = new Scanner(System.in).nextInt();
                if (He_eingabe1 == 0)
                {
                    System.out.println("Programm beendet");
                    return;
                }
                else if (He_eingabe1 == -1)
                {
                    System.out.println("Bitte Task eingeben: ");
                    String He_Eingabe2 = new Scanner(System.in).nextLine();
                    tasks.add(He_Eingabe2);
                }
                 else if (He_eingabe1 == -2)
                {
                    System.out.println("Bitte Task eingeben: ");
                    int He_Eingabe3 = new Scanner(System.in).nextInt()-1;
                  //  tasks.add(He_Eingabe2);
                    tasks.remove(He_Eingabe3);
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
