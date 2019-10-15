package at.ac.fhcampuswien;

import at.ac.fhcampuswien.shapes.Rectangle;

public class RectangleController {

    private boolean capacity;

    public static void main(String[] args){
        
    }
    Rectangle rectangles[]; // speichert Rechtecke und ermöglicht späteren Zugriff
    private int capacityOfArray; //– Größe des Arrays .

    public RectangleController(int capacityOfArray) {
        this.capacityOfArray = capacityOfArray;
    }

    private boolean hasCapacity(){
        return capacity;
    };

    /*– überprüft den verfügbaren Speicherplatz
            (Vergleich Rectangle.count mit capacity). Gibt eine
    Fehlermeldung aus.*/

   private void printRectangles(){

   }

    /* – Iteriert über das Array und gibt für
    alle Referenzen != null das entsprechende Objekt mittels
    toString() aus.*/

    Rectangle[] getRectangles() {
        return new Rectangle[0];
    }

    /*– liefert eine Referenz auf das
    Array mit Rechtecken zurück.*/


    private boolean addRectangle(Rectangle r) {
        return false;
    }

    /*– fügt eine Rechteck
    Referenz in dem Array an nächster freier Position hinzu.*/

    private void printMenu(){
        System.out.println("Menu:\n" +
                "0...Exit\n" +
                "1...Print Rectangles\n" +
                "2...Create Rectangle\n" +
                "3...Intersect Rectangles\n" +
                "4...Union Rectangles\n" +
                "5...Move Rectangle\n" +
                "6...is Inside");
    }

}
