package SHAPE;

public class Shape {
    private String nama;
    private String color;
    
    public Shape() {
        this.nama = "";
        this.color = "";
    }
    public Shape(String nama, String color) {
        this.nama = nama;
        this.color = color;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public String getcolor() {
        return this.color;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setcolor(String color) {
        this.color = color;
    }
    
    public void print() {
        System.out.println("Nama : " + this.nama);
        System.out.println("Color : " + this.color);
    }
}
