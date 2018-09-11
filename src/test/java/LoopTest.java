import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoopTest {
    Loop pattern = null;

    @Before
    public void setUp() throws Exception {
        pattern = new Loop();
    }

    @After
    public void tearDown() throws Exception {
        pattern = null;
    }

    @Test
    public void printPatternTrue() throws Exception {
        String exp = "1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ";
        String act = pattern.printPattern(5);
        assertEquals(exp, act);
    }

    @Test
    public void printPatternTrue1() throws Exception {
        String exp = "1 2 2 3 3 3 ";
        String act = pattern.printPattern(3);
        assertEquals(exp, act);
    }
}