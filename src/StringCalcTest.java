import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StringCalcTest {

    @Test
    public void addStringWithEqualLength() {
        String first =  "01101";
        String second = "10001";
        String expectedRes = "11110";
        String actualRes = StringCalc.add(first, second);
        assertEquals(expectedRes, actualRes);
    }

    @Test
    public void addStringWithDifferentLength() {
        String first =  "101101";
        String second = " 10001";
        String expectedRes = "111110";
        String actualRes = StringCalc.add(first, second);
        assertEquals(expectedRes, actualRes);
    }

    @Test
    public void addStringWithBigDifferentLength() {
        String first =  "10111101101";
        String second = "10001";
        String expectedRes = "10111111110";
        String actualRes = StringCalc.add(first, second);
        assertEquals(expectedRes, actualRes);
    }

    @Test
    public void addStringWithUnit() {
        String first =  "1111";
        String second = "1111";
        String expectedRes = "11110";
        String actualRes = StringCalc.add(first, second);
        assertEquals(expectedRes, actualRes);
    }

    @Test
    public void addStringWithZero() {
        String first =  "0000";
        String second = "00000";
        String expectedRes = "00000";
        String actualRes = StringCalc.add(first, second);
        assertEquals(expectedRes, actualRes);
    }
}