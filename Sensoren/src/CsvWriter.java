import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.ArrayList;

public class CsvWriter {
    // Implements threading
    private String filePath;
    private double interval;
    private Sensor sensor;
    private long timeStamp;

    public CsvWriter(String filePath, double interval, Sensor sensor) {
        this.filePath = filePath;
        this.interval = interval;
        this.sensor = sensor;

        CreateFile(filePath);
    }

    public void run() {
        this.timeStamp = System.currentTimeMillis();
    }

    public void CreateFile(String filePath) {
        try {
            File myObj = new File(filePath);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public void writeIntoFile(String filePath, String Content) {
        try {
            FileWriter myWriter = new FileWriter(filePath);
            myWriter.write(Content);
            myWriter.close();

        } catch (IOException e) {
            System.out.println("An error occurred:" + e.getMessage());
        }
    }

    public void writeIntoCSV(long timeStamp, String nameOfSensor, String unit, double measurement) {
        writeIntoFile(filePath, "This is the content of the file");
    }

}