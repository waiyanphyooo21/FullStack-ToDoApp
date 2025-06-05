package com.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import jakarta.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

@Controller
public class LoginController {

    @PostMapping("/login")
    public void login(@RequestParam("email") String email,
                      @RequestParam("password") String password,
                      HttpServletResponse response) throws IOException {

        if ("user@example.com".equals(email) && "1234".equals(password)) {
            response.sendRedirect("todo.html");
        } else {
            response.sendRedirect("index.html?error=1");
        }
    }
}
