package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/") //slash떄문에 localhost:8080으로 들어오면 이게 호출이 된다고 함
    public String home() {
        return "home";
    }
}
