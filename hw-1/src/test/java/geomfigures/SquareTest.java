package geomfigures;

import org.junit.After;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    private Square square;

    @After
    public void afterTest() {
        square = null;
    }

    @Test
    public void testGetSquare() throws Exception{
        square = new Square(1);
        assertEquals(1, square.getSquare(), "Check the Square of the 1-side square");
    }

    @Test
    public void testGetSquare2() throws Exception{
        square = new Square(9);
        assertEquals(81, square.getSquare(), "Check the Square of the 9-side square");
    }

    @Test
    public void testGetSquare3() throws Exception{
        square = new Square(15.9);
        assertEquals(252.81, square.getSquare(), "Check the Square of the 15.9-side square");
    }
}