import java.util.Random;
public class Barometric1000PressureSensorImpl extends PressureSensor {
    public String getUnit() {
        return "Pascal";
    }

    public String getName() {
        return "Barometric1000PressureSensor";
    }

    // Diese solle einen Wert zwischen 0.5 und 1.05 in die measurmentValue Variable schreiben.
    public double doMeasurement() {
        Random r = new Random();
        double minNum = 0.5;
        double maxNum = 1.05;
        return measurementValue = minNum + (maxNum - minNum) * r.nextDouble();
    }

}
