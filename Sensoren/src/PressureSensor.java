public abstract class PressureSensor extends Sensor
{
    private String unit;
    protected double measurementValue;

    // gibt einfach die Variable measurementValue zurück.
    public double getValue() {
        return measurementValue;
    }

    // gibt einfach die Variable unit zurück.
    public String getUnit() {
        return unit;
    }

}
