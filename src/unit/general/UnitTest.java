package unit.general;

import java.text.DecimalFormatSymbols;

import org.junit.Test;

/**
 * Test for general unit tools.
 * 
 * @author Markus Wichmann
 * 
 */
public class UnitTest {

    private static final char DOT = DecimalFormatSymbols.getInstance().getDecimalSeparator();

    @Test
    public void someTest() {
        Value<Length> value = new Value<>(20.0, Length.METER);
        value.getUnit().getFactorToBase();
    }
}
