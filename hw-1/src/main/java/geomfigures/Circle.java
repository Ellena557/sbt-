package geomfigures;

public class Circle {
    private final double r;

    public double getR() {
        return r;
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getSquare(){
        return 3.14*r*r;
    }
}

