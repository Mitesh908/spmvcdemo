package com.lvg.spmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller   //bean class or u can call component as well
public class LoginController {
       @GetMapping("/login")
       public String getLoginPage()
       {
    	   return "Login";
       }
}
