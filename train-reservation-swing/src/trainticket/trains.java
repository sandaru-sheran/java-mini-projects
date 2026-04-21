package trainticket;

/**
 * A simple data class to hold information about a SINGLE train.
 */
public class trains {
    // Fields for a single train
    public String trainId;
    public int firstClass;
    public int secondClass;
    public int thirdClass;

    // Constructor to create a train with specific data
    public trains(String trainId, int firstClass, int secondClass, int thirdClass) {
        this.trainId = trainId;
        this.firstClass = firstClass;
        this.secondClass = secondClass;
        this.thirdClass = thirdClass;
    }

    // No-argument constructor (optional but can be useful)
    public trains() {
    }
}