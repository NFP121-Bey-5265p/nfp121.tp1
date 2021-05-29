package question3;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TestAuditeurCnam.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestAuditeurCnam
{
    /**
     * Default constructor for test class TestAuditeurCnam
     */
    public TestAuditeurCnam()
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
    public void TestAuditeurName()
    {
        question3.AuditeurCNAM auditeur1 = new question3.AuditeurCNAM("Ton-Ton", "max", "12345");
        question3.AuditeurCNAM auditeur2 = new question3.AuditeurCNAM("Te-Te", "max", "12345");
        question3.AuditeurCNAM auditeur3 = new question3.AuditeurCNAM("Chloé", "chloé", "12345");
        question3.AuditeurCNAM auditeur4 = new question3.AuditeurCNAM("thon", "germon", "12345");
        question3.AuditeurCNAM auditeur5 = new question3.AuditeurCNAM("Marc", "Man", "12345");
    }
}

