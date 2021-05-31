package question1;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class Question1Test1.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Question1Test1
{
    /**
     * Default constructor for test class Question1Test1
     */
    public Question1Test1()
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
    public void Test1Question1()
    {
        
        question1.Circle circle1 = new question1.Circle();
        question1.Square square1 = new question1.Square();
        question1.Triangle triangle1 = new question1.Triangle();
        question1.Circle circle2 = new question1.Circle();
        question1.Square square2 = new question1.Square();
        question1.Triangle triangle2 = new question1.Triangle();
        circle1.makeVisible();
        square1.makeVisible();
        triangle1.makeVisible();
        circle2.makeVisible();
        circle2.moveDown();
        circle2.moveDown();
        circle2.changeColor("yellow");
        square2.moveVertical(-150);
        square2.moveVertical(100);
        square2.moveVertical(10);
        square2.slowMoveHorizontal(5);
        square2.moveHorizontal(50);
        square2.makeVisible();
        square2.changeColor("magenta");
        triangle2.makeVisible();
        triangle2.slowMoveVertical(150);
        triangle2.changeColor("black");
        
        square1.makeInvisible();
        circle1.makeInvisible();
        triangle1.makeInvisible();
        square2.makeInvisible();
        circle2.makeInvisible();
        triangle2.makeInvisible();
    }
 
}

