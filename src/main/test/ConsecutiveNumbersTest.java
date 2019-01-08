import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
    ConsecutiveNumbers number;

    @Before
    public void setUp() {
        number=new ConsecutiveNumbers();
    }

    @After
    public void tearDown()  {
        number=null;
    }

    @Test
    public void checkConsecutiveSuccess() {
        String expectedValue="Consecutive";
        String actualValue=number.checkConsecutive("1,2,3,4,5,6,7");
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void checkConsecutiveFailure() {
        String expectedValue="not consecutive";
        String actualValue=number.checkConsecutive("1,2,3,4,6,6,7");
        assertEquals(expectedValue,actualValue);
    }
}