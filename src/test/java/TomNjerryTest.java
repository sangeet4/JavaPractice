import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomNjerryTest {
    TomNjerry tomJerry = null;

    @Before
    public void setUp() throws Exception {
        tomJerry = new TomNjerry();
    }

    @After
    public void tearDown() throws Exception {
        tomJerry = null;
    }

    @Test
    public void oddOrEvenTrue() throws Exception{
        String exp = "Tom";
        String act = tomJerry.oddOrEven(23);
        assertEquals(exp, act);
    }

    @Test
    public void oddOrEvenFalse() throws Exception{
        String exp = "Jerry";
        String act = tomJerry.oddOrEven(26);
        assertEquals(exp, act);
    }

    @Test
    public void oddOrEvenBoundaryLeft() throws Exception{
        String exp = "Number is out of range";
        String act = tomJerry.oddOrEven(3);
        assertEquals(exp, act);
    }

    @Test
    public void oddOrEvenBoundaryRight() throws Exception{
        String exp = "Number is out of range";
        String act = tomJerry.oddOrEven(32);
        assertEquals(exp, act);
    }
}