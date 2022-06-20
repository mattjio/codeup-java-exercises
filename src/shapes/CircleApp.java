package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input in = new Input();
        System.out.println("Give me a number that represents the radius of a circle and watch the magic");
        Circle circle = new Circle(in.getDouble());
        System.out.println("The circumference of your circle is "+circle.getCircumference());
        System.out.println("The area of your circle is " +circle.getArea());
    }
}
