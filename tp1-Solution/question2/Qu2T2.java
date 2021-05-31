package question2;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class Qu2T2.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Qu2T2
{
    /**
     * Default constructor for test class Qu2T2
     */
    public Qu2T2()
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
    public void Qu2T2()
    {
        question2.Picture picture1 = new question2.Picture();
        picture1.draw();
        picture1.setBlackAndWhite();
        picture1.setColor();
        picture1.slowMoveVertical();
        picture1.clearScreen();
        
    }
}

