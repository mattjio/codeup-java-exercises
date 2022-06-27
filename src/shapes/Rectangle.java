package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public int getPerimeter() {
        return (this.length*2)+(this.width*2);
    }

    @Override
    public int getArea() {
        return this.length*this.width;
    }

    @Override
    public int setLength() {
        return this.length;
    }

    @Override
    public int setWidth() {
        return this.width;
    }
/*
    protected int length;
    protected int width;


    public Rectangle(int length,int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return this.length*this.width;
    }

    public int getPerimeter() {
        return (this.length*2)+(this.width*2);
    }

 */
}
