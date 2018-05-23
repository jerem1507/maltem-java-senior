package lu.maltem.exercise2;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NumberSumTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(NumberSumTest.class);

    private static NumberSum ns;

    @BeforeClass
    public static void setUpBeforeClass() {
        ns = new NumberSum();
    }

    @Test
    public void testNumberSum() {
        assertEquals(1, 1);
        assertEquals(3, 12);
        assertEquals(3, -12);
        assertEquals(45, 123456789);
    }

    private void assertEquals(int expected, int numberToSum) {
        ns.sum = 0;
        Assert.assertEquals("Expected number is : " + expected, expected, ns.getSum(numberToSum));
    }
}
