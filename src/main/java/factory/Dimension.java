package factory;

public class Dimension {

    private int high;
    private int width;
    private int tankCapacity;

    public Dimension(int high, int widht, int tankCapacity){
        this.high = high;
        this.width = widht;
        this.tankCapacity = tankCapacity;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }
}
