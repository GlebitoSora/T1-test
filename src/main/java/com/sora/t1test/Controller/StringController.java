package com.sora.t1test.Controller;

import com.sora.t1test.Response.SortedCharacterMap;
import com.sora.t1test.Service.StringService;
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
