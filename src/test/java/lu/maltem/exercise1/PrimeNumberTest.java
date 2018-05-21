package lu.maltem.exercise1;


import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PrimeNumberTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test(expected = TechnicalException.class)
    public void nullParameterCheck() throws TechnicalException, PrimeNumberException {
        PrimeNumber.isPrimeNumber(null);

    }

    @Test(expected = PrimeNumberException.class)
    public void negativeParameterCheck() throws TechnicalException, PrimeNumberException {
        PrimeNumber.isPrimeNumber(-1);
    }

    @Test
    public void methodImplementationCheck() throws TechnicalException, PrimeNumberException {

        // Prime Numbers
        Assert.assertTrue(PrimeNumber.isPrimeNumber(2));
        Assert.assertTrue(PrimeNumber.isPrimeNumber(3));
        Assert.assertTrue(PrimeNumber.isPrimeNumber(5));
        Assert.assertTrue(PrimeNumber.isPrimeNumber(7));
        Assert.assertTrue(PrimeNumber.isPrimeNumber(11));
        Assert.assertTrue(PrimeNumber.isPrimeNumber(601));
        Assert.assertTrue(PrimeNumber.isPrimeNumber(929));
        Assert.assertTrue(PrimeNumber.isPrimeNumber(379));

        // Not Prime Numbers
        Assert.assertFalse(PrimeNumber.isPrimeNumber(0));
        Assert.assertFalse(PrimeNumber.isPrimeNumber(1));
        Assert.assertFalse(PrimeNumber.isPrimeNumber(4));
        Assert.assertFalse(PrimeNumber.isPrimeNumber(600));
        Assert.assertFalse(PrimeNumber.isPrimeNumber(930));
        Assert.assertFalse(PrimeNumber.isPrimeNumber(380));
        Assert.assertFalse(PrimeNumber.isPrimeNumber(397));
    }
}
