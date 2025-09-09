package com.example.demo;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// import com.example.demo.HelloService;

@RestController
public class HelloController {
    @GetMapping("/api/hello")
    public Map<String, String> hello(@RequestParam(defaultValue = "kunieda") String name) {
        HelloService helloService = new HelloService();
        Map<String, String> a = helloService.hello1(name);
        return a;
        /*
        System.out.println("aaaaaa");
        return Map.of("message", "こんにちは、" + name + "さん！");
         */   
    }


    @GetMapping("/api/pass")
    public Map<String, String> pass(@RequestParam(defaultValue = "natsumi") String pass) {
        HelloService helloService = new HelloService();
        Map<String, String> c = helloService.hello2(pass);
        return c;
        /*
        String result2;
        if(pass.matches("\\d+")){
            result2 = "数字";
        }else{
            result2 = "文字";
        }
        return Map.of("message",result2);
         */
    }
    //ここから計算
    @GetMapping("/api/sum")
    public Map<String, String> sum(@RequestParam(defaultValue = "") String number1,@RequestParam(defaultValue = "") String number2) {
        HelloService a = new HelloService();
        Map<String, String> b = a.hello3(number1,number2);
        return b;
        /*
        System.out.println(number1);
        System.out.println(number2);
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
         */
    }                            
}