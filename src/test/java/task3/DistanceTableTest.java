package task3;

import org.junit.Test;

import static org.junit.Assert.*;

public class DistanceTableTest {
    @Test
    public void addAndRetrieveDistanceValues() {
        DistanceTable distanceTable = new DistanceTable();
        distanceTable.add("Amsterdam", "Berlin", 365);
        distanceTable.add("Copenhagen", "Amsterdam", 381);

        assertEquals(365, distanceTable.getDistance("Amsterdam", "Berlin"));
        assertEquals(365, distanceTable.getDistance("Berlin", "Amsterdam"));
        assertEquals(381, distanceTable.getDistance("Copenhagen", "Amsterdam"));
        assertEquals(381, distanceTable.getDistance("Amsterdam", "Copenhagen"));
    }
}
