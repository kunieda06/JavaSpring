package com.example.demo;
import java.util.Map;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;
@Service
public class HelloService {
    private static final Pattern INT_PATTERN = Pattern.compile("-?\\d+"); // 負数OK

    public Map<String, String> hello1(String name){
        System.out.println("aaaaaa");
        return Map.of("message", "こんにちは、" + name + "さん！");
    }
    
    
    public Map<String, String> hello2(String pass){
        String result2;
        if(pass.matches("\\d+")){
        result2 = "数字";
        }else{
        result2 = "文字";
        }
        return Map.of("message",result2);
    }


    public Map<String, String> hello3(String number1, String number2) {
        // System.out.println(number1);
        // System.out.println(number2);
        if(number1.isEmpty() && number2.isEmpty()){
            return Map.of("message","両方入力されていません。");
        }
        if(number1.isEmpty() ^ number2.isEmpty()){
            return Map.of("message","片方入力されていません。");
        }
        String numberRegex = "\\d+";
        if(!number1.matches(numberRegex) || !number2.matches(numberRegex)){
            return Map.of("message","文字を含んでいます。");
        }
        try{
            int n1 = Integer.parseInt(number1);
            int n2 = Integer.parseInt(number2);
            int result3 = n1 + n2;
            return Map.of("message", String.valueOf(result3));
        }catch(NumberFormatException e){
            return Map.of("error","数字に変換できませんでした。"); 
        }
        
    }
}





