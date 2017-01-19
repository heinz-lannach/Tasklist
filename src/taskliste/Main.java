/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskliste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import taskliste.gui.AbstractMenu;
import taskliste.gui.Hauptmenue;
import taskliste.gui.TaskAnzeigenMenue;
import taskliste.gui.TaskDetailMenue;

/**
 *
 * @author referent
 */
public class Main
{

    public static int mainMenu()
    {
        System.out.println("Taskliste");
        System.out.println();
        System.out.println("(1) Tasks auflisten");
        System.out.println("(2) Task hinzufügen");
        System.out.println("(3) Task löschen");
        System.out.println("(4) Taskdetails anzeigen");
        System.out.println("(5) Programm beenden");
        System.out.println();
        System.out.print("Bitte Option wählen: ");
        return new Scanner(System.in).nextInt();
    }

    public static void printList(LinkedList<String> liste)
    {
        int i = 1;
        for (String element : liste)
        {
            System.out.format("(%d) %s\n", i, element);
            i = i + 1;
        }
    }

    public static void addTask(LinkedList<String> liste)
    {
        System.out.print("Task eingeben: ");
        String task = new Scanner(System.in).nextLine();
        liste.add(task);
    }

    public static void deleteTask(LinkedList<String> liste)
    {
        try
        {
            System.out.print("Task eingeben: ");
            int tasknr = new Scanner(System.in).nextInt();
            liste.remove(tasknr - 1);
        }
        catch (InputMismatchException err)
        {
            System.out.println("Ungültige Eingabe");   
        }
    }

    public static int getPreviousTask(int current, LinkedList<String> tasks)
    {
        int previous = current - 1;
        if (previous < 1)
        {
            previous = tasks.size();
        }
        return previous;
    }

    public static int getNextTask(int current, LinkedList<String> tasks)
    {
        int next = current + 1;
        if (next > tasks.size())
        {
            next = 1;
        }
        return next;
    }

    public static int printTask(int tasknummer, LinkedList<String> alleTasks)
    {
        if (tasknummer < 1 || tasknummer > alleTasks.size())
        {
            System.out.println("Diesen Task kenne ich nicht");
        }
        else
        {
            String chosenTask = alleTasks.get(tasknummer - 1);
            System.out.println("Sie haben \"" + chosenTask + "\" ausgewählt");
            tasknummer = printTaskSubMenu(tasknummer, alleTasks);
        }
        return tasknummer;
    }

    public static int printTaskSubMenu(int choice, LinkedList<String> tasks)
    {
        System.out.println("(v)orheriger Task | (n)ächster Task | (H)auptmenü");
        int subChoice = new Scanner(System.in).next().charAt(0);
        switch (subChoice)
        {
            case 'v':
                choice = getPreviousTask(choice, tasks);
                break;
            case 'n':
                choice = getNextTask(choice, tasks);
                break;
            case 'H':
                throw new UnsupportedOperationException("Noch nicht programmiert");
            default:
                throw new UnsupportedOperationException("Noch nicht programmiert");
        }
        return choice;
    }

    public static void choseTask(LinkedList<String> tasks)
    {
        try
        {
            System.out.print("Einen Task wählen: ");
            int choice = new Scanner(System.in).nextInt();
            while (true)
            {
                choice = printTask(choice, tasks);
            }
        }
        catch (InputMismatchException error)
        {
            System.out.println("Ungültige Eingabe");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        try
        {
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/taskliste?user=root&password=np");
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM tasks WHERE bezeichnung LIKE ?");
           stmt.setString(1,"%");
           ResultSet res = stmt.executeQuery();
           while(res.next())
           {
               System.out.println(res.getString("bezeichnung"));
               
           }
           res.close();
           stmt.close();
           conn.close();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        Taskliste tl = new Taskliste();
        
        tl.add(new Task("Einkaufen"));
        tl.add(new Task("Fenster zerstören"));
        tl.add(new Task("Test"));
        
        Hauptmenue hm = new Hauptmenue();
        hm.ausgeben();
        
        TaskAnzeigenMenue tam = new TaskAnzeigenMenue();
        tam.ausgeben();
        
        TaskDetailMenue tdm = new TaskDetailMenue(tl);
        tdm.ausgeben();
        
        
        Person p1 = new Person("Simon", "Gunacker");
        System.out.println(p1);
        
        p1.setVorname("Dagobert");
        System.out.println(p1);
        
        Task t1 = new Task("Fenster zerstören", LocalDate.now(), p1);
        System.out.println(t1);
        
        
        
        tl.print();
        
        /*
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Einkaufen");
        tasks.add("Autovignette");
        tasks.add("Fenster putzen");

        while (true)
        {
            int option = mainMenu();
            switch (option)
            {
                case 1:
                    printList(tasks);
                    break;
                case 2:
                    addTask(tasks);
                    break;
                case 3:
                    deleteTask(tasks);
                    break;
                case 4:
                    choseTask(tasks);
                    break;
                case 5:
                    System.out.println("Programm beendet.");
                    return;
                default:
                    System.out.println("Ungültige Eingabe");
            }
        }
        */
    }

}
