package factory;

public class Dimension {

    private int high;
    private int width;
    private int trankCapacity;

    public Dimension(int high, int widht, int trankCapacity){
        this.high = high;
        this.width = widht;
        this.trankCapacity = trankCapacity;
    }

    public int getTrankCapacity() {
        return trankCapacity;
    }
}
