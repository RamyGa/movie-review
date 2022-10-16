package com.ramy.moviereview;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {



    @GetMapping("/")
    String indexPage (Model model){
//        model.addAttribute("key", "some value");
        return "web_pages/index";
    }



}
