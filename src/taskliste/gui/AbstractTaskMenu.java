/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskliste.gui;

import taskliste.Task;
import taskliste.Taskliste;
import taskliste.command.ExitCommand;

/**
 *
 * @author referent
 */
public class AbstractTaskMenu extends AbstractMenu
{

    public AbstractTaskMenu(Taskliste taskliste)
    {
        for (Task t : taskliste)
        {
            this.optionen.add(new Entry(t.getBezeichnung(), t.getCommand()));
        }
    }
    
    @Override
    public void ausgeben()
    {
        super.ausgeben("Welchen Task wählen Sie");
    }
}
