package lu.maltem.exercise3;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MaltemSingapTest {

    private static final String MALTEM = "Maltem";
    private static final String SINGAP = "Singap";
    private static final String MALTEM_SINGAP = MALTEM + SINGAP;

    @Test
    public void testMaltemSingap() {
        int start = 1;
        int end = 300;
        int size = end - start + 1;
        final List<String> values = MaltemSingap.maltemSingap(start, end);
        Assert.assertEquals("List must be sized correctly", size, values.size());
        assertThisIsNumberStored(values.get(0), start);
        assertThisIsStringStored(values.get(4), SINGAP);
        assertThisIsStringStored(values.get(2), MALTEM);
        assertThisIsStringStored(values.get(34), SINGAP);
        assertThisIsStringStored(values.get(35), MALTEM);
        assertThisIsStringStored(values.get(14), MALTEM_SINGAP);
        assertThisIsStringStored(values.get(36), 37+"");
        assertThisIsStringStored(values.get(256), 257+"");
        assertThisIsStringStored(values.get(194), MALTEM_SINGAP);
        assertThisIsStringStored(values.get(199), SINGAP);
        assertThisIsStringStored(values.get(233), MALTEM);
        assertThisIsStringStored(values.get(298), 299+"");
        assertThisIsStringStored(values.get(299), MALTEM_SINGAP);
        assertThisIsStringStored(values.get(44), MALTEM_SINGAP);

    }

    private void assertThisIsNumberStored(final String value, final int expected) {
        Assert.assertEquals("This must be the number '" + expected + "' Stored !",
                value, expected + "");
    }

    private void assertThisIsStringStored(final String actual, final String expected) {
        Assert.assertEquals("This must be the word '" + expected + "' stored !",
                expected, actual);
    }
}
