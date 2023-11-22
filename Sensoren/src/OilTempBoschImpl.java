import java.util.Random;

public class OilTempBoschImpl extends TemperaturSensor {
    public double doMeasurement()
    {
        Random r = new Random();
        double minNum = 0.0;
        double maxNum = 36.0;
        return measurementValue = minNum + (maxNum - minNum) * r.nextDouble();
    }
}
