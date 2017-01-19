/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskliste.gui;

import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;
import taskliste.Task;
import taskliste.command.AbstractCommand;
import taskliste.command.ExitCommand;

/**
 *
 * @author referent
 */
public abstract class AbstractMenu
{

    protected LinkedList<Entry> optionen;

    public AbstractMenu()
    {
        this.optionen = new LinkedList<>();
    }
    
    public void ausgeben()
    {
        ausgeben("Welche Option wählen Sie");
    }
    
    public void ausgeben(String frage)
    {
        ausgeben(frage, "Die Option kenne ich nicht");
    }
    
    public void ausgeben(String frage, String fehler)
    {
        anzeigen();
        fragen(frage, fehler);
    }

    private void anzeigen()
    {
        int i = 1;
        for (Entry t : this.optionen)
        {
            System.out.format("(%d) %s\n", i, t.getBezeichnung());
            i = i + 1;
        }
        System.out.println("");
    }

    private void fragen(String frage, String fehler)
    {
        System.out.print(frage + ": ");
        try
        {
            int eingabe = new Scanner(System.in).nextInt();
            if (eingabe < 1 || eingabe > this.optionen.size())
            {
                System.out.println(fehler);
            }
            else
            {
                Entry e = this.optionen.get(eingabe);
                AbstractCommand command = e.getCommand();
                command.execute();
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("Ungültige Eingabe");
        }
    }
}
