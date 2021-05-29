package question2;



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
    public void Test1()
    {
        question2.Picture picture1 = new question2.Picture();
        picture1.draw();
        question2.Picture picture2 = new question2.Picture();
        picture2.draw();
        picture2.slowMoveVertical();
        picture2.slowMoveVertical();
        picture1.slowMoveVertical();
    }
}

