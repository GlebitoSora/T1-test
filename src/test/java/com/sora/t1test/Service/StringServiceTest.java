package com.sora.t1test.Service;

import com.sora.t1test.Response.SortedCharacterMap;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class StringServiceTest {
    StringService stringService = new StringService();
    @Test
    public void getResultTest(){
        String result = "abbaac";
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 3);
        map.put('b', 2);
        map.put('c', 1);
        SortedCharacterMap sortedCharacterMap = new SortedCharacterMap(map);
        assertEquals(sortedCharacterMap, stringService.getResult(result));
    }
}
