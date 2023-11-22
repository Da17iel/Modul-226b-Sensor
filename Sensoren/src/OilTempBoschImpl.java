import java.util.Random;

public class OilTempBoschImpl extends TemperaturSensor {
    public String getUnit() {
        return "Celsius";
    }
    public String getName() {
        return "OilTempBosch";
    }
    public double doMeasurement()
    {
        Random r = new Random();
        double minNum = 0.0;
        double maxNum = 36.0;
        return measurementValue = minNum + (maxNum - minNum) * r.nextDouble();
    }
}
