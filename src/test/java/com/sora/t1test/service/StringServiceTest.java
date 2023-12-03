package com.sora.t1test.service;

import com.sora.t1test.response.SortedCharacterMap;
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
    @Test
    public void getResultTest2(){
        String result = "bbfxxb3224w k";
        Map<Character, Integer> map = new HashMap<>();
        map.put('b',3);
        map.put('x', 2);
        map.put('2', 2);
        map.put('f', 1);
        map.put('w', 1);
        map.put('k', 1);
        map.put(' ', 1);
        map.put('3', 1);
        map.put('4', 1);
        SortedCharacterMap sortedCharacterMap = new SortedCharacterMap(map);
        SortedCharacterMap event = stringService.getResult(result);
        assertEquals(sortedCharacterMap, event);
    }
}
