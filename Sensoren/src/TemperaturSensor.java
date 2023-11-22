public abstract class TemperaturSensor extends Sensor
{
    private String unitName;
    protected double measurementValue;

    // gibt einfach die Variable measurementValue zurück.
    public double getValue() {
        return measurementValue;
    }

    // Gets the String unit of the current Unit
    public String getUnit() {
        return unitName;
    }
}
