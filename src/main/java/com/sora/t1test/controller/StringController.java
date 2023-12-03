package com.sora.t1test.controller;

import com.sora.t1test.response.SortedCharacterMap;
import com.sora.t1test.service.StringService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
@RequestMapping("/test")
public class StringController {
    private final StringService stringService;
    @GetMapping("/result")
    public SortedCharacterMap getResult(@RequestParam String str) {
        return stringService.getResult(str);
    }
}
