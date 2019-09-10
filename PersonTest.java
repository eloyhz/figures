

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PersonTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PersonTest
{
    private Person person1;
    
    /**
     * Default constructor for test class PersonTest
     */
    public PersonTest()
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
        person1 = new Person();
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
        assertEquals(280, person1.getX());
        assertEquals(190, person1.getY());
        assertEquals("black", person1.getColor());
        assertEquals(30, person1.getWidth());
        assertEquals(60, person1.getHeight());
        assertEquals(false, person1.isVisible());
    }

    @Test
    public void testMakeVisible()
    {
        person1.makeVisible();
        assertEquals(true, person1.isVisible());
    }

    @Test
    public void testHide()
    {
        person1.makeVisible();
        person1.makeInvisible();
        assertEquals(false, person1.isVisible());
    }

    @Test
    public void testMoveRight()
    {
        int xPos = person1.getX();
        person1.moveRight();
        xPos += Person.DISTANCE;
        assertEquals(xPos, person1.getX());
    }
    
    @Test
    public void testMoveLeft()
    {
        int xPos = person1.getX();
        person1.moveLeft();
        xPos -= Person.DISTANCE;
        assertEquals(xPos, person1.getX());
    }

    @Test
    public void testMoveUp()
    {
        int yPos = person1.getY();
        person1.moveUp();
        yPos -= Person.DISTANCE;
        assertEquals(yPos, person1.getY());
    }

    @Test
    public void testMoveDown()
    {
        int yPos = person1.getY();
        person1.moveDown();
        yPos += Person.DISTANCE;
        assertEquals(yPos, person1.getY());
    }
    
    @Test
    public void testMoveVertical()
    {
        int yPos = person1.getY();
        person1.moveVertical(30);
        yPos += 30;
        assertEquals(yPos, person1.getY());
        person1.moveVertical(-50);
        yPos -=50;
        assertEquals(yPos, person1.getY());
    }
    
    @Test
    public void testMoveHorizontal()
    {
        int xPos = person1.getX();
        person1.moveHorizontal(30);
        xPos += 30;
        assertEquals(xPos, person1.getX());
        person1.moveHorizontal(-50);
        xPos -=50;
        assertEquals(xPos, person1.getX());
    }

    @Test
    public void testChangeColor()
    {
        person1.changeColor("red");
        assertEquals("red", person1.getColor());
        person1.changeColor("yellow");
        assertEquals("yellow", person1.getColor());
        person1.changeColor("blue");
        assertEquals("blue", person1.getColor());
        person1.changeColor("green");
        assertEquals("green", person1.getColor());
        person1.changeColor("magenta");
        assertEquals("magenta", person1.getColor());
        person1.changeColor("black");
        assertEquals("black", person1.getColor());
    }

    @Test
    public void testChangeSize()
    {
        person1.changeSize(30, 20);
        assertEquals(20, person1.getWidth());
        assertEquals(30, person1.getHeight());
    }    
}
