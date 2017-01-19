/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskliste.gui;

import taskliste.command.AbstractCommand;

/**
 *
 * @author referent
 */
public class Entry
{

    private String bezeichnung;
    private AbstractCommand command;

    public Entry(String bezeichnung, AbstractCommand command)
    {
        this.bezeichnung = bezeichnung;
        this.command = command;
    }
    
    public String getBezeichnung()
    {
        return this.bezeichnung;
    }
    
    public AbstractCommand getCommand()
    {
        return this.command;
    }

}
