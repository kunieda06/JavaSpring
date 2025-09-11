package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class HanteiService {

    public List<String> judgeInputs(List<String> inputs) {
        List<String> result = new ArrayList<>();

    for (String input : inputs) {
        if (input == null || input.isEmpty()) {
            result.add("エラー：空白です");
            continue;
        }
        if (input.matches("\\d+")) {
            result.add("数字");
        } else {
            result.add("文字");
        }

        /*末長  continue を使わずに判定する方法*/
        // if (input == null || input.isEmpty()) {
        //     result.add("エラー：空白です");
        // }else{
        //     if (input.matches("\\d+")) {
        //         result.add("数字");
        //     } else {
        //         result.add("文字");
        //     }
        // }
    }

        return result;
    }
};