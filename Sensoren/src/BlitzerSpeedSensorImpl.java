import java.util.Random;

public class BlitzerSpeedSensorImpl extends SpeedSensor {
    public String getUnit() {
        return "Kmh";
    }
    public String getName() {
        return "BlitzerSpeedSensor";
    }
    public double doMeasurement() {
        Random r = new Random();
        double randNum = r.nextDouble(350);
        return velocity = randNum;
    }
}
