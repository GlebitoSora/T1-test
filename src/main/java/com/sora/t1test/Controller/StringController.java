package com.sora.t1test.Controller;
import com.sora.t1test.Response.SortedCharacterMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/test")
public class StringController {
    @GetMapping("/result")
    public SortedCharacterMap get_String(@RequestParam String str){
        Map<Character, Integer> unsortedMap = new HashMap<>();
        for (char key : str.toCharArray()) {
            if (unsortedMap.containsKey(key)) {
                unsortedMap.put(key, unsortedMap.get(key) + 1);
            } else {
                unsortedMap.put(key, 1);
            }
        }
        Map<Character, Integer> sortedMapByValue = unsortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        return new SortedCharacterMap(sortedMapByValue);
    }
}