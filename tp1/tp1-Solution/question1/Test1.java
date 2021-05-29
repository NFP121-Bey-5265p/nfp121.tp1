package question1;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class Test1.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Test1
{
    /**
     * Default constructor for test class Test1
     */
    public Test1()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void Testing()
    {
        question1.Circle circle2 = new question1.Circle();
        question1.Square square2 = new question1.Square();
        question1.Triangle triangle2 = new question1.Triangle();
        triangle2.makeVisible();
        square2.makeVisible();
        circle2.makeVisible();
        triangle2.moveHorizontal(200);
        square2.moveUp();
        square2.moveVertical(-200);
        square2.moveVertical(200);
        circle2.moveDown();
        question1.Circle circle3 = new question1.Circle();
        circle3.makeVisible();
        circle3.changeColor("yellow");
        circle3.slowMoveVertical(100);
    }
}

