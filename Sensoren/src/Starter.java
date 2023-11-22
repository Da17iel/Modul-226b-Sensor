import java.nio.channels.WritableByteChannel;

public class Starter {
    public static void main(String[] args) throws InterruptedException {
        // Creates a new writer using the BarometricPressure Sensor
        CsvWriter baroPressure = new CsvWriter("C:\\Users\\danie\\Downloads\\BarometricPressure.txt", 200, new Barometric1000PressureSensorImpl());
        baroPressure.start();

        // Creates a new writer using the Aqualung Pro Drive Sensor
        CsvWriter aquaPressure = new CsvWriter("C:\\Users\\danie\\Downloads\\aquaPressure.txt", 200, new Aqualung2021ProDivePressureSensorImpl());
        aquaPressure.start();

        // Creates a new writer using the Blitzer Sensor
        CsvWriter blitzerWriter = new CsvWriter("C:\\Users\\danie\\Downloads\\Blitzer.txt", 200, new BlitzerSpeedSensorImpl());
        blitzerWriter.start();

        System.out.println("Programm closes");
    }
}
