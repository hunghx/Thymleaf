package ra.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.thymeleaf.model.Persons;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("/")
    public String home(Model model){
        Persons per = new Persons(1,"DUY NẾN",true);
        model.addAttribute("person",per);
        int[] list = {1,2,3,4,5};
        model.addAttribute("list",list);
        model.addAttribute("name","<a  href='#'>Nguyễn Văn A</a>");
        return "home";
    }
}
