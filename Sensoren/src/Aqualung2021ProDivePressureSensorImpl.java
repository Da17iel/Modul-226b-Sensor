import java.util.Random;

public class Aqualung2021ProDivePressureSensorImpl extends PressureSensor {
    public String getUnit() {
        return "Pascal";
    }
    public String getName() {
        return "Aqualung2021ProDivePressureSensor";
    }

    /*
        Hier wird in realität eine Random Nummer generiert
         */
    public double doMeasurement() {
        Random r = new Random();
        double minNum = 0.0;
        double maxNum = 10.0;
        return measurementValue = minNum + (maxNum - minNum) * r.nextDouble();
    }
}
