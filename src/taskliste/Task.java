/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskliste;

import java.time.LocalDate;
import taskliste.command.AbstractCommand;
import taskliste.command.ExitCommand;

/**
 *
 * @author Referent
 */
public class Task
{

    private String bezeichnung;
    private LocalDate faelligkeit;
    private Person verantworlicher;
    private AbstractCommand command;

    public Task(String bezeichnung)
    {
        this.bezeichnung = bezeichnung;
        this.faelligkeit = LocalDate.now();
        this.verantworlicher = new Person("Noch", "Niemand");
        this.command = new ExitCommand();
    }
    
    public Task(String bezeichnung, LocalDate faelligkeit, Person verantworlicher)
    {
        this.bezeichnung = bezeichnung;
        this.faelligkeit = faelligkeit;
        this.verantworlicher = verantworlicher;
        this.command = new ExitCommand();
    }

    public AbstractCommand getCommand()
    {
        return command;
    }
    
    public String getBezeichnung()
    {
        return bezeichnung;
    }

    public LocalDate getFaelligkeit()
    {
        return faelligkeit;
    }

    public Person getVerantworlicher()
    {
        return verantworlicher;
    }

    public void setCommand(AbstractCommand command)
    {
        this.command = command;
    }
    
    public void setBezeichnung(String bezeichnung)
    {
        this.bezeichnung = bezeichnung;
    }

    public void setFaelligkeit(LocalDate faelligkeit)
    {
        this.faelligkeit = faelligkeit;
    }

    public void setVerantworlicher(Person verantworlicher)
    {
        this.verantworlicher = verantworlicher;
    }

    @Override
    public String toString()
    {
        return bezeichnung + " (" + verantworlicher + ")";
    }
}
