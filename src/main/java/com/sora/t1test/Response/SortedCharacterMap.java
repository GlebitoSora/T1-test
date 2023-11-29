package com.sora.t1test.Response;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;
@Getter
@Setter
public class SortedCharacterMap {

    private final Map<Character, Integer> map;
    public SortedCharacterMap(Map<Character, Integer> map) {
        this.map = map;
    }
}


