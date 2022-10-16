package com.ramy.moviereview;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class IndexController {



    @GetMapping("/")
    String indexPage (Model model){
//        model.addAttribute("key", "some value");
        return "web_pages/index";
    }



}
