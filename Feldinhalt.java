
/**
 * Beschreiben Sie hier die Klasse Feldinhalt.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Feldinhalt
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String titel;
    private String beschreibung;
    private int effekt;
    private Spieler besitzer;
    private boolean gekauft;
    private boolean kaufmoeglich;
    private int miete;
    

    public Feldinhalt(String titel1, String beschreibung1, boolean k, int m)
    {
        titel = titel1;
        beschreibung = beschreibung1;
        kaufmoeglich = k;
        miete = m;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public String titelGeben()
    {
        return titel;
    }

    public String beschreibungGeben()
    {
        return beschreibung;

    }

    public int effekt()
    {
        return effekt;
    }

    public void kaufen(Spieler e)
    {
        besitzer = e;
        gekauft = true;
    }

    public int mieteGeben()
    {
        return miete;
    }

    public boolean gekauftGeben()
    {
        return gekauft;
    }

    public boolean kaufmoeglichGeben()
    {
        return kaufmoeglich;
    }

    public Spieler besitzerGeben()
    {
       return besitzer;
    }
}
