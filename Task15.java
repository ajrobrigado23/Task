public class Task15 {

    public static void main(String[] args) {

        Circle circle1 = new Circle(2, 0,0);

        Rectangle rectangle1 = new Rectangle(0, 4, 2);
    }
}

interface Shape {

    double calculateArea();

    double calculatePerimeter();
}

abstract class AbstractShape implements Shape {

    private double radius;
    private double length;
    private double width;

    public AbstractShape(double radius, double length, double width) {
        this.radius = radius;
        this.length = length;
        this.width = width;
    }

    public double getRadius() {
        return radius;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double calculateArea() {
        return 0.0;
    }

    public double calculatePerimeter() {
        return 0.0;
    }
}

class Circle extends AbstractShape {

    public Circle(double radius, double length, double width) {
        super(radius, length, width);
    }

    @Override
    public double calculateArea() {
        return (Math.PI * super.getRadius() * super.getRadius());
    }
}

class Rectangle extends AbstractShape {

    public Rectangle(double radius, double length, double width) {
        super(radius, length, width);
    }

    // 2 * (length + width)
    @Override
    public double calculatePerimeter() {
        return (2 * super.getLength() + super.getWidth());
    }
}
