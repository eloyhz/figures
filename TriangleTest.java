

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TriangleTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TriangleTest
{
    private Triangle triangle1;
    
    /**
     * Default constructor for test class TriangleTest
     */
    public TriangleTest()
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
        triangle1 = new Triangle();
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
        assertEquals(210, triangle1.getX());
        assertEquals(140, triangle1.getY());
        assertEquals("green", triangle1.getColor());
        assertEquals(70, triangle1.getWidth());
        assertEquals(60, triangle1.getHeight());
        assertEquals(false, triangle1.isVisible());
    }

    @Test
    public void testMakeVisible()
    {
        triangle1.makeVisible();
        assertEquals(true, triangle1.isVisible());
    }

    @Test
    public void testHide()
    {
        triangle1.makeVisible();
        triangle1.makeInvisible();
        assertEquals(false, triangle1.isVisible());
    }

    @Test
    public void testMoveRight()
    {
        int xPos = triangle1.getX();
        triangle1.moveRight();
        xPos += Triangle.DISTANCE;
        assertEquals(xPos, triangle1.getX());
    }
    
    @Test
    public void testMoveLeft()
    {
        int xPos = triangle1.getX();
        triangle1.moveLeft();
        xPos -= Triangle.DISTANCE;
        assertEquals(xPos, triangle1.getX());
    }

    @Test
    public void testMoveUp()
    {
        int yPos = triangle1.getY();
        triangle1.moveUp();
        yPos -= Triangle.DISTANCE;
        assertEquals(yPos, triangle1.getY());
    }

    @Test
    public void testMoveDown()
    {
        int yPos = triangle1.getY();
        triangle1.moveDown();
        yPos += Triangle.DISTANCE;
        assertEquals(yPos, triangle1.getY());
    }
    
    @Test
    public void testMoveVertical()
    {
        int yPos = triangle1.getY();
        triangle1.moveVertical(30);
        yPos += 30;
        assertEquals(yPos, triangle1.getY());
        triangle1.moveVertical(-50);
        yPos -=50;
        assertEquals(yPos, triangle1.getY());
    }
    
    @Test
    public void testMoveHorizontal()
    {
        int xPos = triangle1.getX();
        triangle1.moveHorizontal(30);
        xPos += 30;
        assertEquals(xPos, triangle1.getX());
        triangle1.moveHorizontal(-50);
        xPos -=50;
        assertEquals(xPos, triangle1.getX());
    }

    @Test
    public void testChangeColor()
    {
        triangle1.changeColor("red");
        assertEquals("red", triangle1.getColor());
        triangle1.changeColor("yellow");
        assertEquals("yellow", triangle1.getColor());
        triangle1.changeColor("blue");
        assertEquals("blue", triangle1.getColor());
        triangle1.changeColor("green");
        assertEquals("green", triangle1.getColor());
        triangle1.changeColor("magenta");
        assertEquals("magenta", triangle1.getColor());
        triangle1.changeColor("black");
        assertEquals("black", triangle1.getColor());
    }

    @Test
    public void testChangeSize()
    {
        triangle1.changeSize(30, 20);
        assertEquals(20, triangle1.getWidth());
        assertEquals(30, triangle1.getHeight());
    }    
}

