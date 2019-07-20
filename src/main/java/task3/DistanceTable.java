package task3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DistanceTable {
    private Map<Set<String>, Integer> distances;

    public DistanceTable()
    {
        this.distances = new HashMap<>();
    }

    void add(String key1, String key2, int distance)
    {
        Set<String> combinedKey = new HashSet<>();
        combinedKey.add(key1);
        combinedKey.add(key2);
        distances.put(combinedKey, distance);
    }

    int getDistance(String key1, String key2)
    {
        Set<String> combinedKey = new HashSet<>();
        combinedKey.add(key1);
        combinedKey.add(key2);
        return distances.get(combinedKey);
    }
}
