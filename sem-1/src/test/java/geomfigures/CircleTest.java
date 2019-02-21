package geomfigures;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    private Circle circle;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before CircleTest.class");
    }

    @AfterClass
    public  static void afterClass() {
        System.out.println("After CircleTest.class");
    }

    @After
    public void afterTest() {
        circle = null;
    }

    @Test
    public void testGetSquare() throws Exception{
        circle = new Circle(1);
        assertEquals(3.14,circle.getSquare(), "Check the square of the 1-radius circle");
    }

    @Test
    public void testGetSquare2() throws Exception{
        circle = new Circle(7);
        assertEquals(153.86,circle.getSquare(), "Check the square of the 7-radius circle");
    }

    @Test
    public void testGetSquare3() throws Exception{
        circle = new Circle(5);
        assertEquals(78.5,circle.getSquare(), "Check the square of the 5-radius circle");
    }

    @Ignore("Message for ignored test")
    @Test
    public void ignoredTest() {
        System.out.println("Nothing will be printed");
    }
}