/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskliste.gui;

import taskliste.command.ExitCommand;

/**
 *
 * @author referent
 */
public class Hauptmenue extends AbstractMenu
{
    public Hauptmenue()
    {
        super.optionen.add(new Entry("Tasks anzeigen", new ExitCommand()));
        super.optionen.add(new Entry("Tasks löschen", new ExitCommand()));
        super.optionen.add(new Entry("Task Detail anzeigen", new ExitCommand()));
        super.optionen.add(new Entry("Programm beenden", new ExitCommand()));
    }
    
}
