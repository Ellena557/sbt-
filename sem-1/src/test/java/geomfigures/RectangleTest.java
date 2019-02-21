package geomfigures;

import org.junit.After;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    private Rectangle rect;

    @After
    public void afterTest() {
        rect = null;
    }

    @Test
    public void testGetSquare() throws Exception{
        rect = new Rectangle(5, 7.7);
        assertEquals(38.5, rect.getSquare(), "Check the Square of the rect with sides 5, 7.7");
    }

    @Test
    public void testGetSquare2() throws Exception{
        rect = new Rectangle(9.9, 17.3);
        assertEquals(171.27, rect.getSquare(), "Check the Square of the rect with sides 9.9, 17.3");
    }

    @Test
    public void testGetSquare3() throws Exception{
        rect = new Rectangle(25, 47);
        assertEquals(1175, rect.getSquare(), "Check the Square of the rect with sides 25, 47");
    }
}