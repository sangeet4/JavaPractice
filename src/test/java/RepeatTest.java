import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatTest {
    Repeat rep = null;

    @Before
    public void setUp() throws Exception {
        rep = new Repeat();
    }

    @After
    public void tearDown() throws Exception {
        rep = null;
    }

    @Test
    public void repeatStringTrue() throws Exception{
        String exp = "Stackrouterouterouterouterouteroute";
        String act = rep.repeatString("Stackroute", 5);
        assertEquals(exp, act);
    }

    @Test
    public void repeatStringNoChange() throws Exception{
        String exp = "Stackroute";
        String act = rep.repeatString("Stackroute", 0);
        assertEquals(exp, act);
    }

    @Test
    public void repeatStringError() throws Exception{
        String exp = "Error";
        String act = rep.repeatString("Stackroute", 11);
        assertEquals(exp, act);
    }
}