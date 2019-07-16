package part2;

import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CvUnitTest {

    @Test
    public void testDeepVsShallowCopy() throws ParseException {
        PersonalDetails personalDetails = new PersonalDetails("Dieter", "Doman");
        List<WorkItem> workHistory = new ArrayList<>();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        workHistory.add(new WorkItem("Test Company 1", "Software Engineer", dateFormat.parse("2014-02-11"), dateFormat.parse("2015-02-11")));
        workHistory.add(new WorkItem("Test Company 2", "Software Engineer", dateFormat.parse("2015-02-12"), dateFormat.parse("2016-02-11")));
        List<Qualification> qualifications = new ArrayList<>();
        qualifications.add(new Qualification("BscIT", "UP", dateFormat.parse("2013-02-11")));
        Cv cv = new Cv(personalDetails, workHistory, qualifications);
        assertNotSame(personalDetails, cv.getPersonalDetails());
        assertNotSame(workHistory, cv.getWorkHistory());
        assertNotSame(qualifications, cv.getQualifications());
    }
}
