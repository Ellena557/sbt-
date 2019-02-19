package geomfigures;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("The square of the circle is " + circle.getSquare());

        Square square = new Square(7);
        System.out.println("The square of the square is "+ square.getSquare());

        Rectangle rect = new Rectangle(7,5);
        System.out.println("The square of the rectangle is " + rect.getSquare());
    }
}
