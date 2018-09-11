import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString reversed = null;

    @Before
    public void setUp() throws Exception {
        reversed = new ReverseString();
    }

    @After
    public void tearDown() throws Exception {
        reversed = null;
    }

    @Test
    public void stringReverseTest1() throws Exception{
        String exp = "yrraH";
        String act = reversed.stringReverse("Harry");
        assertEquals(exp, act);
    }

    @Test
    public void stringReverseTest2() throws Exception{
        String exp = "rettoP";
        String act = reversed.stringReverse("Potter");
        assertEquals(exp, act);
    }
}