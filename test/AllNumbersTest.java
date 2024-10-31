import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class AllNumbersTest {
   @Test
    public void printToNumber_whenZero () {
       BigInteger zeroNumber = BigInteger.ZERO;
       String result = AllNumbers.printToNumber(zeroNumber);
       Assertions.assertEquals("0", result);
    }

    @Test
    public void printToNumber_whenOne () {
        BigInteger oneNumber = BigInteger.ONE;
        String result = AllNumbers.printToNumber(oneNumber);
        Assertions.assertEquals("0 1", result);
    }

    @Test
    public void printToNumber_whenFifteen () {
        BigInteger fifteenNumber = new BigInteger("15");
        String result = AllNumbers.printToNumber(fifteenNumber);
        Assertions.assertEquals("0 1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz", result);
    }

    @Test
    public void printToNumber_whenTwenty () {
        BigInteger twentyNumber = new BigInteger("20");
        String result = AllNumbers.printToNumber(twentyNumber);
        Assertions.assertEquals("0 1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz", result);
    }
}
