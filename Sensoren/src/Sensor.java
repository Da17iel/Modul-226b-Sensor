public abstract class Sensor {
    /**
     * Returns the unit of the measurement
     * @return String of the Unit Name used in this sensor
     */
    public abstract String getUnit();

    /**
     * Returns the measured value.
     * @return measured value
     */
    public abstract double getValue();

    /**
     * Only get the Name of the measurement. Ex: "Aussentemperatur in Baar"
     * @return name of measurement
     */
    public abstract String getName();

    /**
     * Actually does the measurement
     * @return measured value of the sensor
     */
    public abstract double doMeasurement();

}
