package com.wykd.springbootwar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;

@Controller
public class HelloController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/index2")
    public String index2(HashMap<String,Object> map, Model model){

        model.addAttribute("text1", "hello world");
        map.put("name", "兰陵王");
        map.put("age", 43);
        map.put("job", "王");
        return "index";
    }

}
