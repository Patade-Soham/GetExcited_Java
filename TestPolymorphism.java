class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {
        Shape s;

        s = new Circle(5);
        System.out.println("Circle Area: " + s.area());

        s = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + s.area());
    }
}
