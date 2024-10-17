package SHAPE;

public class Cube extends Rectangle {
    private int height;
    public Cube() {
        super();
        height = 0;
    }
    public Cube(String name, String color, int legth, int width, int height) {
        super(name, color, legth, width);
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void calc() {
        System.out.println("Area : " + super.getLegth() * super.getWidth() * this.height);
    }
    public void print() {
        System.out.println("cube : " + this.height);
    }
}

