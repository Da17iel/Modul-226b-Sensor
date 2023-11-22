public class FileEntries {
    private long timeStamp;
    private String nameOfSensor;
    private String unit;
    private double measurement;

    public FileEntries(long timeStamp, String nameOfSensor, String unit, double measurement) {
        this.timeStamp = timeStamp;
        this.nameOfSensor = nameOfSensor;
        this.unit = unit;
        this.measurement = measurement;
    }

    public String toString() {
        return String.join(";", Long.toString(timeStamp), nameOfSensor, unit, Double.toString(measurement));
    }
}
