package SHAPE;

public class Rectangle extends Shape {
    private int legth;
    private int width;

    public Rectangle() {
        super();
        legth = 0;
        width = 0;
    }
        public Rectangle(String name, String color, int legth, int width) {
        super();
        this.legth = legth;
        this.width = width;
    }

    public int getLegth() {
        return legth;
    }

    public void setLegth(int legth) {
        this.legth = legth;
    }

    public int getWidth() {
        return width;
    }

    public void calc() {
        System.out.println("Area : " + this.legth * this.width);
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public void print() {
        System.out.println("Rectangle : " + this.legth + " " + this.width);
    }
}
