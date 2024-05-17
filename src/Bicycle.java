public class Bicycle extends WheeledTransport {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Bicycle(String modelName) {
        super(modelName, 2);
    }
}