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
public class TaskAnzeigenMenue extends AbstractMenu
{
    public TaskAnzeigenMenue()
    {
        super.optionen.add(new Entry("Vorherigen Task", new ExitCommand()));
        super.optionen.add(new Entry("Nächsten Task", new ExitCommand()));
        super.optionen.add(new Entry("Zum Hauptmenü", new ExitCommand()));
    }
    
}
