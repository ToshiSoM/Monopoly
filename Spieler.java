
/**
 * Beschreiben Sie hier die Klasse Spieler.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Spieler
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int geld;
    private Spieler naechstersp;
    private int position;
    private int feldnr;
    private String name;

    public Spieler(int guthaben, String n)
    {
        geld = guthaben;
        
        position = 0;
        name = n;
    }

    public void guthabenAktualisieren(int neu)
    {
        geld = geld + neu;
    }

    public int guthabenAusgeben()
    {
        return geld;
    }

    public void ziehen(int z)
    {
        position = position + z;
    }

    public Spieler naechsterGeben()
    { 
       return naechstersp;
    }
    
    public void naechsterSetzen(Spieler s)
    { 
       naechstersp = s;
    }
    
    public int posGeben()
    {
        return position;
    }
    
    public void feldnrSetzen(int e)
    {
        feldnr = e;
    }
    
    public int feldnrGeben()
    {
        return feldnr;
    }
    
    public String nameGeben()
    {
        return name;
    }
}
