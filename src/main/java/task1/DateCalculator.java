package task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateCalculator {
    public long daysUntilChristmas(Date currentTime) throws ParseException {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
        LocalDate localDate = currentTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int year  = localDate.getYear();
        Date christmasTime = myFormat.parse("25 12 " + year);
        long diff = christmasTime.getTime() - currentTime.getTime();
        if (diff < 0)
        {
            christmasTime = myFormat.parse("25 12 " + (year + 1));
            diff = christmasTime.getTime() - currentTime.getTime();
        }
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
}
