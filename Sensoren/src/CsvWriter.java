import java.io.BufferedWriter;
import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors

public class CsvWriter extends Thread {
    // Implements threading
    private final String filePath;
    private final int interval;
    private final Sensor sensor;

    /**
     * Creates a new writer that writes sensor information into logfile
     * @param filePath Full absolute path of the logfile
     * @param interval Interval in Milliseconds
     * @param sensor Given Sensor
     */
    public CsvWriter(String filePath, int interval, Sensor sensor) {
        this.filePath = filePath;
        this.interval = interval;
        this.sensor = sensor;

        CreateFile(filePath);
    }

    public void run() {
        // Implement the Variables
        double measurement;
        String nameOfSensor;
        String unit;
        long timeStamp;
        int counter = 0;

        // Assign the values that you need to assign only once
        nameOfSensor = sensor.getName();
        unit = sensor.getUnit();

        // Now implement a loop using the interval
        while (counter < 15) {  // Added a counter for showing purposes;
            try {
                sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            measurement = sensor.doMeasurement();
            timeStamp = System.currentTimeMillis();

            writeIntoCSV(timeStamp, nameOfSensor, unit, measurement);
            counter++;
        }
    }

    /**
     * Creates an entry and writes that entry into the file
     * @param timeStamp Timestamp of the measured object
     * @param nameOfSensor String name of the sensor
     * @param unit Units of the measured object
     * @param measurement Value of the measured object
     */
    private void writeIntoCSV(long timeStamp, String nameOfSensor, String unit, double measurement) {
        writeIntoFile(filePath,
                Long.toString(timeStamp) + ";" +
                        nameOfSensor + ";" +
                        unit + ";" +
                        Double.toString(measurement));
    }

    /**
     * Creates a file using the filePath. If file already exists, nothing happens
     * @param filePath absolute filepath of the file to be created
     */
    private void CreateFile(String filePath) {
        try {
            File newFile = new File(filePath);

            if (newFile.exists()) {
                return; // Files already exists
            }

            if (newFile.createNewFile()) {
                System.out.println("File created: " + newFile.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    /**
     * Writes the given content to a given File. If file is not empty, method appends
     * the content
     * @param filePath Absolute target filepath
     * @param content content of the file
     */
    private void writeIntoFile(String filePath, String content) {
        try {
            // Create a BufferedWriter with FileWriter in append mode
            BufferedWriter myWriter = new BufferedWriter(new FileWriter(filePath, true));

            myWriter.write(content);
            myWriter.newLine();
            myWriter.close();

        } catch (IOException e) {
            System.out.println("An error occurred:" + e.getMessage());
        }
    }

}