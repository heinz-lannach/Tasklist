/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskliste.command;

/**
 *
 * @author referent
 */
public class ExitCommand extends AbstractCommand
{

    @Override
    public void execute()
    {
        System.out.println("Programm beendet.");
        System.exit(0);
    }
    
}
