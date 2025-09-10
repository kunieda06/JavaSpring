package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class HanteiController {

    @Autowired
    private HanteiService hanteiService;

    @PostMapping("/path")
    public Map<String, List<String>> judge(@RequestBody Map<String, List<String>> body) {
        List<String> inputs = body.get("inputs");

        List<String> results = hanteiService.judgeInputs(inputs);

        Map<String, List<String>> response = new HashMap<>();
        response.put("judgements", results);
        return response;
    }
};
