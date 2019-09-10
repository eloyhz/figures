

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SquareTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SquareTest
{
    private Square square1;
    
    /**
     * Default constructor for test class SquareTest
     */
    public SquareTest()
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
        square1 = new Square();
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
        assertEquals(310, square1.getX());
        assertEquals(120, square1.getY());
        assertEquals("red", square1.getColor());
        assertEquals(60, square1.getSize());
        assertEquals(false, square1.isVisible());
    }

    @Test
    public void testMakeVisible()
    {
        square1.makeVisible();
        assertEquals(true, square1.isVisible());
    }

    @Test
    public void testHide()
    {
        square1.makeVisible();
        square1.makeInvisible();
        assertEquals(false, square1.isVisible());
    }

    @Test
    public void testMoveRight()
    {
        int xPos = square1.getX();
        square1.moveRight();
        xPos += Square.DISTANCE;
        assertEquals(xPos, square1.getX());
    }
    
    @Test
    public void testMoveLeft()
    {
        int xPos = square1.getX();
        square1.moveLeft();
        xPos -= Square.DISTANCE;
        assertEquals(xPos, square1.getX());
    }

    @Test
    public void testMoveUp()
    {
        int yPos = square1.getY();
        square1.moveUp();
        yPos -= Square.DISTANCE;
        assertEquals(yPos, square1.getY());
    }

    @Test
    public void testMoveDown()
    {
        int yPos = square1.getY();
        square1.moveDown();
        yPos += Square.DISTANCE;
        assertEquals(yPos, square1.getY());
    }
    
    @Test
    public void testMoveVertical()
    {
        int yPos = square1.getY();
        square1.moveVertical(30);
        yPos += 30;
        assertEquals(yPos, square1.getY());
        square1.moveVertical(-50);
        yPos -=50;
        assertEquals(yPos, square1.getY());
    }
    
    @Test
    public void testMoveHorizontal()
    {
        int xPos = square1.getX();
        square1.moveHorizontal(30);
        xPos += 30;
        assertEquals(xPos, square1.getX());
        square1.moveHorizontal(-50);
        xPos -=50;
        assertEquals(xPos, square1.getX());
    }

    @Test
    public void testChangeColor()
    {
        square1.changeColor("red");
        assertEquals("red", square1.getColor());
        square1.changeColor("yellow");
        assertEquals("yellow", square1.getColor());
        square1.changeColor("blue");
        assertEquals("blue", square1.getColor());
        square1.changeColor("green");
        assertEquals("green", square1.getColor());
        square1.changeColor("magenta");
        assertEquals("magenta", square1.getColor());
        square1.changeColor("black");
        assertEquals("black", square1.getColor());
    }

    @Test
    public void testChangeSize()
    {
        square1.changeSize(50);
        assertEquals(50, square1.getSize());
    }
}
