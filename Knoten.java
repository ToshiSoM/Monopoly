
/**
 * Beschreiben Sie hier die Klasse Knoten.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Knoten
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Knoten naechster;
    private Feldinhalt karte;
    private int position;

    /**
     * Konstruktor für Objekte der Klasse Knoten
     */
    public Knoten(Feldinhalt karte1)
    {
        karte = karte1;

    }

    public Knoten naechsterGeben()
    {
        return naechster;

    }

    public void naechsterSetzen(Knoten angabeKnoten)
    {
        naechster = angabeKnoten;

    }

    public Feldinhalt karteGeben()
    {
        return karte;

    }
    
    public int posGeben()
    {
        return position;
        
    }
}
