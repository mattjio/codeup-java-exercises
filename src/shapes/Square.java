package shapes;

public class Square extends Quadrilateral{
    public Square(int length,int width) {
        super(length, width);
    }

    @Override
    public int getPerimeter() {
        return this.length*4;
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
    public Square(int side) {
        super(side, side);
    }
}
