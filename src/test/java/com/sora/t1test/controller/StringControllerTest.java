package com.sora.t1test.controller;

import com.sora.t1test.response.SortedCharacterMap;
import com.sora.t1test.service.StringService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
class StringControllerTest {
    @Mock
    private StringService stringService;
    @InjectMocks
    private StringController controller;
    @Test
    public void getResultEndPointTest(){
        String inputString = "aaaaabcccc";
        Map<Character,Integer> expectedResult = new HashMap<>();
        expectedResult.put('a', 5);
        expectedResult.put('b', 1);
        expectedResult.put('c', 4);
        when(stringService.getResult(inputString)).thenReturn(new SortedCharacterMap(expectedResult));
        SortedCharacterMap sortedCharacterMapResult = controller.getResult(inputString);
        assertEquals(new SortedCharacterMap(expectedResult), sortedCharacterMapResult);
    }

}