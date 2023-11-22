import java.util.Random;

public class Thermo2000Impl extends TemperaturSensor {
    public String getUnit() {
        return "Celsius";
    }
    public String getName() {
        return "Thermo2000";
    }
    public double doMeasurement()
    {
        Random r = new Random();
        double minNum = 0.0;
        double maxNum = 36.0;
        return measurementValue = minNum + (maxNum - minNum) * r.nextDouble();
    }
}
