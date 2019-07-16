package task3;

import com.google.common.collect.ImmutableSet;

import java.util.HashMap;
import java.util.Map;

public class DistanceTable {
    private Map<ImmutableSet<String>, Integer> distances;

    public DistanceTable()
    {
        this.distances = new HashMap<>();
    }

    void add(String key1, String key2, int distance)
    {
        distances.put(ImmutableSet.of(key1, key2), distance);
    }

    int getDistance(String key1, String key2)
    {
        return distances.get(ImmutableSet.of(key1, key2));
    }
}
