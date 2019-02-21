package geomfigures;

public class Square extends Shape {
    private final double a;

    public double getA() {
        return a;
    }

    public Square(double a) {
        this.a = a;
    }

    public double getSquare(){
        return a*a;
    }
}
