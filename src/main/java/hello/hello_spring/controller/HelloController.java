package hello.hello_spring.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //컴포넌트
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "마포대교는무너졌냐이새끼야");
        return "hello";
    }
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(value = "name", required = true) String name, Model model) {
        model.addAttribute("name", name);
        return "hello-templete";
    }
    @GetMapping("hello-string")
    @ResponseBody //http에서 Body부에 이 데이터를 직접 넣어주겠다는 뜻임
    public String helloString(@RequestParam("name") String name) {
        return "hello" + name; //여기에 spring넣어주면 name에 다른것이 전달됨, view이런게 없음. 문자가 그대로 들어감
    }
}
