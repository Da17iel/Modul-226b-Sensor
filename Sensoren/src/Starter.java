import java.util.ArrayList;
import java.util.Scanner;

public class Starter {
    private static ArrayList<Sensor> availableSensors;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IntervalTooSmallException {
        // Declare important vars
        availableSensors = new ArrayList<Sensor>();
        availableSensors.add(new Barometric1000PressureSensorImpl());
        availableSensors.add(new Aqualung2021ProDivePressureSensorImpl());
        availableSensors.add(new BlitzerSpeedSensorImpl());

        Sensor chosenSensor;
        int chosenInterval;
        String chosenFileName = System.getProperty("user.home") + "\\Downloads\\";

        try
        {
            chosenSensor = getUserSensor();
            chosenInterval = getUserInterval();
            chosenFileName += getUserFileName();

            CsvWriter csvWriter = new CsvWriter(chosenFileName, chosenInterval, chosenSensor);
            csvWriter.start();

            print("Logfile was created under: " + chosenFileName);
        }
        catch (Exception ex)
        {
            print("An Error occured: " + ex.getMessage());
        }


        print("Programm closes");
    }

    /**
     * Gives the User different options to choose from. User can select the Controller he wants to use
     * @return
     */
    private static Sensor getUserSensor() {
        // Get the Sensor
        print("Please select a sensor (type in number): ");
        int counter = 0;
        for(Sensor sensor : availableSensors) {
            counter++;
            print(counter + ": " + sensor.getName());
        }

        int userInput = Integer.parseInt(scanner.nextLine());

        if (userInput > availableSensors.size()) {
            throw new ArrayIndexOutOfBoundsException("Given Input is out of bounds");
        }

        return availableSensors.get(userInput -1);
    }

    /**
     * Asks the user what interval he wants to use.
     * @return the given interval
     * @throws IntervalTooSmallException if the given input is too small for the interval
     */
    private static int getUserInterval() throws IntervalTooSmallException {
        // Second Question
        print("Interval in milliseconds: ");

        int userInput = Integer.parseInt(scanner.nextLine());

        if (userInput < 0) {
            throw new IntervalTooSmallException("Given Interval was too Small");
        } else if (userInput == 0) {
            return 1000;
        }

        return userInput;
    }

    /**
     * Asks the User what filesname the logfile should have.
     * If no name is given, defaultfilename.csv is returned
     * @return String. User input of FileName
     */
    private static String getUserFileName() {
        // Third question
        print("Filename of the Logfile(*.txt|*.csv): ");

        String userInput = scanner.nextLine();

        if (userInput.isEmpty()) {
            return "defaultFileName.csv";
        }
        return userInput;
    }

    /**
     * Helper function to write into the console
     * @param content The content that should be written into the console 
     */
    private static void print(String content) {
        System.out.println(content);
    }
}
