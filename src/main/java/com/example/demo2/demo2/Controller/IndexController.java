package com.example.demo2.demo2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping
    public String index(){return "index";}
    @GetMapping("/savemember")
    public String signup(){return "savemember";}
    @GetMapping("admin")
    public String adminpage(){return "admin";}
    @GetMapping("/memberList")
    public String memberList(){
        return "memberList";
    }
}
