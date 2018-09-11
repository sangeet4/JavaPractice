import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnalyzerTest {
    Analyzer charInspect = null;

    @Before
    public void setUp() throws Exception {
        charInspect = new Analyzer();
    }

    @After
    public void tearDown() throws Exception {
        charInspect = null;
    }

    @Test
    public void characterPropCapital() throws Exception{
        String exp = "Capital Letter";
        String act = charInspect.characterProp('F');
        assertEquals(exp, act);
    }

    @Test
    public void characterPropSmall() throws Exception{
        String exp = "Small Letter";
        String act = charInspect.characterProp('u');
        assertEquals(exp, act);
    }

    @Test
    public void characterPropDigit() throws Exception{
        String exp = "Digit";
        String act = charInspect.characterProp('4');
        assertEquals(exp, act);
    }

    @Test
    public void characterPropSpecial() throws Exception{
        String exp = "Special Symbol";
        String act = charInspect.characterProp('@');
        assertEquals(exp, act);
    }
}