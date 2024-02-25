package Tema7;

public class Circle {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return (Math.PI * radius * radius);
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
