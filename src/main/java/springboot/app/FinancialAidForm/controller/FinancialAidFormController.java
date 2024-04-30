package springboot.app.FinancialAidForm.controller;

import org.springframework.web.bind.annotation.*;
import springboot.app.FinancialAidForm.model.FormResponse;

import static java.lang.Character.isUpperCase;

@RestController
public class FinancialAidFormController {
    @GetMapping("/aid-form/{response}")
    public FormResponse getResponse(String response) {
        return new FormResponse("HelloWorld!");
    }

    @PostMapping("/camel-case")
    public int camelcase(@RequestBody FormResponse formResponse) {
        String response = formResponse.getResponse();
        int word_count = 1;
        for (int i = 0; i < response.length(); i++) {
            if (isUpperCase(response.charAt(i)))
                word_count++;

        }
        return word_count;

    }

    @PostMapping("/show-results")
    public String showResults(@RequestBody FormResponse formresponse) {
        String response = formresponse.getResponse();
        int count = 0;
        for (int i = 0; i < response.length(); i++) {
            count++;
        }
        return count + "";
    }

    @PostMapping("/capitalize")
    public String capitalize(@RequestBody FormResponse formresponse) {
        String response = formresponse.getResponse();
        response = response.trim();
        String[] stringArray = response.split(" ");
        response = " ";
        int i = 0;
        char c;
        for (; i < stringArray.length; i++) {
            c = Character.toUpperCase(stringArray[i].charAt(0));
            stringArray[i] = stringArray[i].replaceFirst(stringArray[i].charAt(0) + "", c + "");
            response += stringArray[i] + " ";
        }

        return response;

    }

}
