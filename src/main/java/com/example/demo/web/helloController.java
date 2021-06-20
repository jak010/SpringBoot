package com.example.demo.web;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Getter
@Setter
class User {
    private String userId;
    private String name;
    private String authType;

    public User(String userId, String name, String authType) {
        super();
        this.userId = userId;
        this.name = name;
        this.authType = authType;
    }
}

@Controller
public class helloController {

    @GetMapping("hello")
    public ModelAndView hello() {
        User user = new User("k", "kk", "kkk");

        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");

        mv.addObject("user",user);

        return mv;
    }

}
