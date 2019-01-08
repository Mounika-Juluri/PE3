import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    RemoveVowels rmVowels;
    @Before
    public void setUp()  {
        rmVowels=new RemoveVowels();
    }

    @After
    public void tearDown()  {
        rmVowels=null;
    }

    @Test
    public void checkVowelsSuccess() {
        String expectedValue="Ind";
        String actualValue=rmVowels.checkVowels("India");
        assertEquals(expectedValue,actualValue);


    }
}