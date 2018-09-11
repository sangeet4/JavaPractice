import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonantTest {
    VowelConsonant charCheck = null;

    @Before
    public void setUp() throws Exception {
        charCheck = new VowelConsonant();
    }

    @After
    public void tearDown() throws Exception {
        charCheck = null;
    }

    @Test
    public void isVowelOrConsonantTest1() throws Exception{
        String exp = "Consonant Vowel Consonant Consonant Vowel ";
        String act = charCheck.isVowelOrConsonant("Hello");
        assertEquals(exp, act);
    }

    @Test
    public void isVowelOrConsonantTest2() throws Exception{
        String exp = "Consonant Vowel Consonant Consonant Consonant Error Error ";
        String act = charCheck.isVowelOrConsonant("World 1");
        assertEquals(exp, act);
    }

    @Test
    public void isVowelOrConsonantError() throws Exception{
        String exp = "Error ";
        String act = charCheck.isVowelOrConsonant("1");
        assertEquals(exp, act);
    }
}