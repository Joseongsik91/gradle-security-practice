package jss.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController{

@RequestMapping("/")
public String index(Model model) {
    model.addAttribute("message", "HELLO!����");
    return "index";
}

}