import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;
/**
 * Beschreiben Sie hier die Klasse Spiel.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Spiel
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Spieler aktiv;
    private Spieler spieler1;
    private Spieler spieler2;
    private Spieler spieler3;
    private Spieler spieler4;
    private Feldinhalt feld1;
    private Feldinhalt feld2;
    private Feldinhalt feld3;
    private Feldinhalt feld4;
    private Feldinhalt feld5;
    private Feldinhalt feld6;
    private Feldinhalt feld7;
    private Feldinhalt feld8;
    private Feldinhalt feld9;
    private Feldinhalt feld10;
    private Knoten knoten1;
    private Knoten knoten2;
    private Knoten knoten3;
    private Knoten knoten4;
    private Knoten knoten5;
    private Knoten knoten6;
    private Knoten knoten7;
    private Knoten knoten8;
    private Knoten knoten9;
    private Knoten knoten10;
    private int anzahl = 10;
    private Knoten erster = knoten1;
    

    public Spiel(int spieler, int startguthaben)
    {

        spieler1 = new Spieler(startguthaben,"Spieler1");
        spieler2 = new Spieler(startguthaben,"Spieler2");
        spieler3 = new Spieler(startguthaben,"Spieler3");
        spieler4 = new Spieler(startguthaben,"Spieler4");
        spieler1.naechsterSetzen(spieler2);
        spieler2.naechsterSetzen(spieler3);
        spieler3.naechsterSetzen(spieler4);
        spieler4.naechsterSetzen(spieler1);
        feld1 = new Feldinhalt("Lagestraße", "Sie verstehen nichts", true, 10);
        feld2 = new Feldinhalt("Lagestraße", "Sie verstehen nichts", true, 10);
        feld3 = new Feldinhalt("Lagestraße", "Sie verstehen nichts", true, 10);
        feld4 = new Feldinhalt("Lagestraße", "Sie verstehen nichts", true, 10);
        feld5 = new Feldinhalt("Lagestraße", "Sie verstehen nichts", true, 10);
        feld6 = new Feldinhalt("Lagestraße", "Sie verstehen nichts", true, 10);
        feld7 = new Feldinhalt("Lagestraße", "Sie verstehen nichts", true, 10);
        feld8 = new Feldinhalt("Lagestraße", "Sie verstehen nichts", true, 10);
        feld9 = new Feldinhalt("Lagestraße", "Sie verstehen nichts", true, 10);
        feld10 = new Feldinhalt("Lagestraße", "Sie verstehen nichts", true, 10);
        knoten1 = new Knoten(feld1);
        knoten2 = new Knoten(feld2);
        knoten3 = new Knoten(feld3);
        knoten4 = new Knoten(feld4);
        knoten5 = new Knoten(feld5);
        knoten6 = new Knoten(feld6);
        knoten7 = new Knoten(feld7);
        knoten8 = new Knoten(feld8);
        knoten9 = new Knoten(feld9);
        knoten10 = new Knoten(feld10);
        knoten1.naechsterSetzen(knoten2);
        knoten2.naechsterSetzen(knoten3);
        knoten3.naechsterSetzen(knoten4);
        knoten4.naechsterSetzen(knoten5);
        knoten5.naechsterSetzen(knoten6);
        knoten6.naechsterSetzen(knoten7);
        knoten7.naechsterSetzen(knoten8);
        knoten8.naechsterSetzen(knoten9);
        knoten9.naechsterSetzen(knoten10);
        
        
        erster = knoten1;
        aktiv = spieler4;

    }

    public Spieler aktuellerSpieler()
    {
        return aktiv;
    }

    public void aktuellerSpielersetzen(Spieler sp)
    {
        aktiv = sp;
    }

    public int wuerfeln()
    {
        
        int k = 1 + (int)(Math.random()*6); 
        return k;
    }
    public Knoten knotenGeben(int pos)
    {
        anzahlAktualisieren();
        Knoten s;
        if (pos > anzahl || pos <= 0)
        {
            System.out.println("Die Position existiert nicht!");
            s = null;
        }
        else{
            int k = 1;
            s = erster;
            while(k!= pos)
            {   k++;
                s = s.naechsterGeben();
            }

        }
        return s;

    }
    public void anzahlAktualisieren()
    {
        Knoten s = erster;
        int k = 0;
        while(s != null)
        {   
            k++;
            s = s.naechsterGeben();
        }
        anzahl = k;
    }
}
