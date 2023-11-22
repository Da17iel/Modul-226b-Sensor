public abstract class SpeedSensor extends Sensor {
    private String unitOfSpeed;
    protected double velocity;

    // gibt einfach die Variable measurementValue zurück.
    public double getValue() {
        return velocity;
    }

    // gibt einfach die Variable unit zurück.
    public String getUnit() {
        return unitOfSpeed;
    }

}
