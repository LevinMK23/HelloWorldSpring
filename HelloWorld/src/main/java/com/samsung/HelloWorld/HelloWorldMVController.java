package com.samsung.HelloWorld;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldMVController {

    private final HelloWorldService helloWorldService;

    public HelloWorldMVController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("/helloMVC")
    public String getHomePage(
            @RequestParam(value = "name", defaultValue = "world") String name,
            Model model
    ) {
        model.addAttribute("name", helloWorldService.getMessageFor(name));
        return "home";
    }
}
