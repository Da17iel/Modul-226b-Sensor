import java.util.Random;

public class Thermo2000Impl extends TemperaturSensor {
    public double doMeasurement()
    {
        Random r = new Random();
        double minNum = 0.0;
        double maxNum = 36.0;
        return measurementValue = minNum + (maxNum - minNum) * r.nextDouble();
    }
}
