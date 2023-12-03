package com.sora.t1test.service;

import com.sora.t1test.response.SortedCharacterMap;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StringService {
    public SortedCharacterMap getResult(String str){
        Map<Character, Integer> unsortedMap = new HashMap<>();
        for (char key : str.toCharArray()) {
            if (unsortedMap.containsKey(key)) {
                unsortedMap.put(key, unsortedMap.get(key) + 1);
            } else {
                unsortedMap.put(key, 1);
            }
        }
        return new SortedCharacterMap(sortingMapByValue(unsortedMap));
    }
    private static Map<Character, Integer> sortingMapByValue(Map<Character, Integer> inputMap) {
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(inputMap.entrySet());
        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        Map<Character, Integer> result = new LinkedHashMap<>();
        entryList.forEach(entry -> result.put(entry.getKey(), entry.getValue()));
        return result;
    }
}
