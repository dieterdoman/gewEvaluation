package task1;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class DateCalculatorTest {

    @Test
    public void testChristmasMethod() throws ParseException {
        DateCalculator dateCalculator = new DateCalculator();
        SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
        Date date = myFormat.parse("16 07 2019");
        assertEquals(162, dateCalculator.daysUntilChristmas(date));
    }
}
