/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskliste;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Referent
 */
public class Taskliste implements Iterable<Task>
{

    private LinkedList<Task> daten;
    
    public Taskliste()
    {
        this.daten = new LinkedList<>();
    }
    
    public void add(Task task)
    {
        this.daten.add(task);
    }

    public void print()
    {
        int i = 1;
        for (Task t : this.daten)
        {
            System.out.format("(%d) %s\n", i, t.getBezeichnung());
            i = i + 1;
        }
    }

    @Override
    public Iterator<Task> iterator()
    {
        return this.daten.iterator();
    }
}
