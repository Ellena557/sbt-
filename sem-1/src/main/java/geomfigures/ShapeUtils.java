package geomfigures;

public class ShapeUtils {
    public static Shape max(Shape obj1, Shape obj2){
        if(obj1.getSquare()>obj2.getSquare()){
            return obj1;
        }
        else {
            return obj2;
        }
    }
}
