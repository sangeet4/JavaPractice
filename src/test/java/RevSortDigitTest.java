import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RevSortDigitTest {
    RevSortDigit revNum = null;

    @Before
    public void setUp() throws Exception {
        revNum = new RevSortDigit();
    }

    @After
    public void tearDown() throws Exception {
        revNum = null;
    }

    @Test
    public void reverseAndSumTest1() throws Exception{
        String exp = "Sorted number in non-increasing order: 54321\nSum of even nummbers: 6\nFalse";
        String act = revNum.reverseAndSum("12345");
        assertEquals(exp, act);
    }

    @Test
    public void reverseAndSumTest2() throws Exception{
        String exp = "Sorted number in non-increasing order: 86421\nSum of even nummbers: 20\nTrue";
        String act = revNum.reverseAndSum("12468");
        assertEquals(exp, act);
    }

    @Test
    public void reverseAndSumError() throws Exception{
        String exp = "Error! Input Entered is not a number";
        String act = revNum.reverseAndSum("Hello");
        assertEquals(exp, act);
    }
}