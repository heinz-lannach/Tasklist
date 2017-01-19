/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskliste;

/**
 *
 * @author Referent
 */
class Person
{

    private String vorname;
    private String nachname;

    public Person(String vorname, String nachname)
    {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname()
    {
        return vorname;
    }

    public String getNachname()
    {
        return nachname;
    }

    public void setVorname(String vorname)
    {
        this.vorname = vorname;
    }

    public void setNachname(String nachname)
    {
        this.nachname = nachname;
    }
    
    public void vorstellen()
    {
        System.out.println("Hallo, ich heiße " + this.vorname + " " + this.nachname);
    }

    @Override
    public String toString()
    {
        return this.nachname + " " + this.vorname;
    }
}
