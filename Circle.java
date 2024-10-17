package SHAPE;

public class Circle extends Shape {
    private int radius;
    public Circle() {
        super();
        radius = 0;
    }
    public Circle(String name, String color, int radius) {
        super();
        this.radius = radius;

    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void calc() {
        System.out.println("Area : " + 3.14 * this.radius * this.radius);
    }
    public void print() {
        System.out.println("Circle : " + this.radius);
    }
}
