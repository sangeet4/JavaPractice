import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome test = null;

    @Before
    public void setUp() throws Exception {
        test = new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void isPalindromeFalse() throws Exception{
        String exp = "12345 is not a Palindrome";
        String act = test.isPalindrome(12345);
        assertEquals(exp, act);
    }

    @Test
    public void isPalindromeTrueLess() throws Exception{
        String exp = "32123 is a Palindrome and the sum of even numbers is less than 25";
        String act = test.isPalindrome(32123);
        assertEquals(exp, act);
    }

    @Test
    public void isPalindromeTrueGreater() throws Exception{
        String exp = "8642468 is a Palindrome and the sum of even numbers is greater than 25";
        String act = test.isPalindrome(8642468);
        assertEquals(exp, act);
    }
}