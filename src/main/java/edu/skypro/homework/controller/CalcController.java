package edu.skypro.homework.controller;

import edu.skypro.homework.service.CalcService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

@RestController
//@RequestMapping("/calculator")
public class CalcController {
    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping("/")
    public String greetings() {
        return """
                 <h2>Добро пожаловать в калькулятор!</h2>
                 Пример использования: divide?num1=X&num2=X<br>
                 <h4>Доступные команды:</h4>
                 <ul>
                     <li>plus - сложить;</li>
                     <li>minus - вычесть;</li>
                     <li>multiply - умножить;</li>
                     <li>divide - разделить;</li>
                 </ul>
                """;
    }

    @GetMapping("/plus")
    public String plus(@RequestParam Integer num1,
                    @RequestParam Integer num2) {
        return buildView(num1, num2, calcService.plus(num1, num2), "+");
    }

    @GetMapping("/minus")
    public String minus(@RequestParam Integer num1,
                     @RequestParam Integer num2) {
        return buildView(num1, num2, calcService.minus(num1, num2), "-");
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam Integer num1,
                        @RequestParam Integer num2) {
        return buildView(num1, num2, calcService.multiply(num1, num2), "*");
    }

    @GetMapping("/divide")
    public String divide(@RequestParam Integer num1,
                         @RequestParam Integer num2) {
        return buildView(num1, num2, calcService.divide(num1, num2), "/");
    }

    private String buildView(Integer num1,
                             Integer num2,
                             Number result,
                             String operation) {
        return num1 + " " + operation + " " + num2 + " = " + result;
    }
}
