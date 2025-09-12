//Derren Christopher Boenardi - 18224040
//Latihan Kelas dan Objek (Main)
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(4,5);
        p1.printPoint();

        Rectangle r1 = new Rectangle();
        r1.width = 10;
        r1.height = 6;
        r1.printRectangle();

        Rectangle r2 = new Rectangle(p1, 5, 4);
        r2.printRectangle();

        r2.move(2, 3);
        r2.printRectangle();
    }
    
}
