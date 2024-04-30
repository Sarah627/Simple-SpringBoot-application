package springboot.app.FinancialAidForm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/aid-form")
    public String showAidForm() {
        return "index";
    }
}
