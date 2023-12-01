package com.sora.t1test.Service;

import com.sora.t1test.Response.SortedCharacterMap;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
public class StringServiceTest {
    StringService stringService = new StringService();
    @Test
    public void getResultTest(){
        String result = "aaaaabcccc";
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 5);
        map.put('c', 4);
        map.put('b', 1);
        SortedCharacterMap sortedCharacterMap = new SortedCharacterMap(map);
        SortedCharacterMap event = stringService.getResult(result);
        assertEquals(sortedCharacterMap, event);
    }
}
