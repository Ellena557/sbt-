package geomfigures;

import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Rect;

import static org.junit.jupiter.api.Assertions.*;

class ShapeUtilsTest {

    @Test
    public void testMaxReturnsLargestShape(){
        Circle circle = new Circle(5);
        Square square = new Square(100);
        Shape result = ShapeUtils.max(square, circle);
        assertEquals(result, square);
    }

    @Test
    public void testMaxReturnsLargestShape2(){
        Rectangle rect = new Rectangle(5, 7);
        Square square = new Square(100);
        Shape result = ShapeUtils.max(rect, square);
        assertEquals(result, square);
    }
}