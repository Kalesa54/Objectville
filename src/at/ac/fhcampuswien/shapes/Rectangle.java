package at.ac.fhcampuswien.shapes;

public class Rectangle {

    private int x1,y1; // P1(x1,y1)
    private int x2,y2; //P2(x2,y2)
    private static int count; //Zählt die Rechtecke
    private int width = x1 + x2; // Breite
    private int height = y1 + y2; //Höhe
    private int deltax;
    private int deltay;
    private boolean inside;

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isInside(int x2, int y2){
        return inside;
    }
}
