package com.sora.t1_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/test")
public class StringController {
    @GetMapping("/get_string")
    public Map<?,?> get_String(@RequestParam String str){
        Map<Character, Integer> map = new HashMap<>();
        for (char key : str.toCharArray()) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        return map;
    }
}
