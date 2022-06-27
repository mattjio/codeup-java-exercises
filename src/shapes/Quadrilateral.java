package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected int length;

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    protected int width;

    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public abstract int setLength();

    public abstract int setWidth();

}
