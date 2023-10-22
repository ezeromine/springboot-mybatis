package com.ezeromine.board.api.home;

import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
@RequestMapping("")
public class HomeController {
    @RequestMapping(value = "", method= RequestMethod.GET)
    public String home(HttpServletRequest request) {
        return "page/index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(HttpServletRequest request){
        return "page/login";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signup(HttpServletRequest request){ return "page/signup";}
}