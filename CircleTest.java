

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CircleTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CircleTest
{
    private Circle circle1;
    
    /**
     * Default constructor for test class CircleTest
     */
    public CircleTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        circle1 = new Circle();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testCreate()
    {
        assertEquals(230, circle1.getX());
        assertEquals(90, circle1.getY());
        assertEquals("blue", circle1.getColor());
        assertEquals(68, circle1.getDiameter());
        assertEquals(false, circle1.isVisible());
    }

    @Test
    public void testMakeVisible()
    {
        circle1.makeVisible();
        assertEquals(true, circle1.isVisible());
    }

    @Test
    public void testHide()
    {
        circle1.makeVisible();
        circle1.makeInvisible();
        assertEquals(false, circle1.isVisible());
    }

    @Test
    public void testMoveRight()
    {
        int xPos = circle1.getX();
        circle1.moveRight();
        xPos += Circle.DISTANCE;
        assertEquals(xPos, circle1.getX());
    }
    
    @Test
    public void testMoveLeft()
    {
        int xPos = circle1.getX();
        circle1.moveLeft();
        xPos -= Circle.DISTANCE;
        assertEquals(xPos, circle1.getX());
    }

    @Test
    public void testMoveUp()
    {
        int yPos = circle1.getY();
        circle1.moveUp();
        yPos -= Circle.DISTANCE;
        assertEquals(yPos, circle1.getY());
    }

    @Test
    public void testMoveDown()
    {
        int yPos = circle1.getY();
        circle1.moveDown();
        yPos += Circle.DISTANCE;
        assertEquals(yPos, circle1.getY());
    }
    
    @Test
    public void testMoveVertical()
    {
        int yPos = circle1.getY();
        circle1.moveVertical(30);
        yPos += 30;
        assertEquals(yPos, circle1.getY());
        circle1.moveVertical(-50);
        yPos -=50;
        assertEquals(yPos, circle1.getY());
    }
    
    @Test
    public void testMoveHorizontal()
    {
        int xPos = circle1.getX();
        circle1.moveHorizontal(30);
        xPos += 30;
        assertEquals(xPos, circle1.getX());
        circle1.moveHorizontal(-50);
        xPos -=50;
        assertEquals(xPos, circle1.getX());
    }

    @Test
    public void testChangeColor()
    {
        circle1.changeColor("red");
        assertEquals("red", circle1.getColor());
        circle1.changeColor("yellow");
        assertEquals("yellow", circle1.getColor());
        circle1.changeColor("blue");
        assertEquals("blue", circle1.getColor());
        circle1.changeColor("green");
        assertEquals("green", circle1.getColor());
        circle1.changeColor("magenta");
        assertEquals("magenta", circle1.getColor());
        circle1.changeColor("black");
        assertEquals("black", circle1.getColor());
    }

    @Test
    public void testChangeSize()
    {
        circle1.changeSize(50);
        assertEquals(50, circle1.getDiameter());
    }
}







