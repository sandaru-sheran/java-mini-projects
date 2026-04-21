package trainticket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class TrainData {
    public static trains[] trainArray = new trains[100000];
    public static int top = 0;


public static void loadDataFromFile() throws IOException {
    try (BufferedReader br = new BufferedReader(new FileReader("train.txt"))) {
        String line;
        while ((line = br.readLine()) != null) {
            if (line.trim().isEmpty()) {
                continue; // Skip empty lines
            }
            
            String[] parts = line.split(",");
            String trainId = parts[0]; // Extract the ID
            
            // *** NEW: Check if the train ID already exists in the array ***
            if (findTrainIndexById(trainId) == -1) {
                // If it does NOT exist, add it
                trainArray[top] = new trains(trainId, Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), Integer.parseInt(parts[3]));
                top++; 
            }
            // If it does exist, we skip it (do nothing)
        }
    }
}
    
    public static void saveDataToFile() throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("train.txt"))) {
            for (int i = 0; i < top; i++) {
                trains train = trainArray[i];
                String line = String.format("%s,%d,%d,%d", train.trainId, train.firstClass, train.secondClass, train.thirdClass);
                writer.write(line);
                writer.newLine(); // Adds a line break after each train entry
            }
        }
    }
    
    
    public static int findTrainIndexById(String trainId) {
        // Loop through the array only up to the last added train (top)
        for (int i = 0; i < top; i++) {
            // Check if the current train's ID matches the one we're looking for (ignoring case)
            if (trainArray[i].trainId.equalsIgnoreCase(trainId)) {
                return i; // Return the index immediately if found
            }
        }
        return -1;
    }
    
    
}