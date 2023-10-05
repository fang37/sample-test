package irfan.sampleproject;


import org.assertj.core.data.MapEntry;
import org.junit.jupiter.api.Test;

import java.util.*;

public class KFrequentElement {

    @Test
    void main() {
        List<Integer> list = List.of(7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9);
        Integer k = 4;

        Map<Integer, Integer> map = new HashMap<>();
        for (Integer element : list) {
            Integer currentValue = map.getOrDefault(element, 0);
            map.put(element, currentValue + 1);
        }
        List<Map.Entry<Integer, Integer>> listOfMap = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());

        Collections.sort(
                listOfMap,
                new Comparator<Map.Entry<Integer, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                        if (o1.getValue().equals(o2.getValue())) {
                            return o2.getKey() - o1.getKey();
                        }
                        return o2.getValue() - o1.getValue();
                    }
                }
        );

        System.out.println(listOfMap.stream().limit(k).toList());
    }
}
