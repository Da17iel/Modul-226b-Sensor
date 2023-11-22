public abstract class Sensor {

    // Diese soll die Einheit der Messung zurückgeben wie zum Beispiel Grad Celsius
    public String getUnit() {
        return "";
    }

    // Die Messung in der Einheit, d.h. ein double wie zum Beispiel 17.0
    public double getValue()
    {
        return 0.0;
    }

    //Diese soll nur den Namen des Messwerts zurückgeben, wie zum Beispiel "Aussentemperatur in Baar"
    public String getName()
    {
        return "";

    }

    // Diese soll die Messung wirklich durchführen, d.h. einen "Sensor auslesen" zum Beispiel indem eine serielle Schnittstelle angesprochen wird oder ein HTTP-Request gemacht wird oder etwas anderes.
    public double doMeasurement()
    {
        return 0;
    }

}
