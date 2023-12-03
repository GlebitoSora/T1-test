package com.sora.t1test.response;

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
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SortedCharacterMap other = (SortedCharacterMap) obj;
        if (map == null) {
            if (other.map != null)
                return false;
        } else if (!map.equals(other.map))
            return false;
        return true;
    }
}


