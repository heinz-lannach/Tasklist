/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskliste;

import java.util.Scanner;

/**
 *
 * @author bfiwest
 */
public class Taskliste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // System.out.println("hello world");
       System.out.println("Task 1");
       System.out.println("Task 2");
       System.out.println("");
       System.out.println("");
       System.out.print("geben sie 1 oder 2 (als Zahl) ein!:");
       int He_Test = new Scanner(System.in).nextInt();
       System.out.println("Sie haben " + He_Test + " ausgewählt");
    }

}
