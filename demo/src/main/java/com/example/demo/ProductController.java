package com.example.demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProductController {
    @GetMapping("/api/product")
    public Map<String, String> product(@RequestParam String number,@RequestParam String subnumber){
        String result1;
        String result2;
        /*文字結合*/
        result1 = number +"-"+ subnumber;
        /*今日の日付を取得*/
        LocalDate today = LocalDate.now();
        String formatteDate = today.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        result2 = formatteDate+"-"+result1;
        
        return Map.of("message1",result1,"message2",result2);
    }
}
