package question3;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class Test2.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Test2
{
    /**
     * Default constructor for test class Test2
     */
    public Test2()
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
    public void Test2()
    {
        question3.AuditeurCNAM auditeur1 = new question3.AuditeurCNAM("Marc", "Mat", "A12");
        question3.AuditeurCNAM auditeur2 = new question3.AuditeurCNAM("Mira", "Charles", "62er");
    }
}

