package br.com.oggima.oggimafriend.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/friend")
public class FriendController {

    @GetMapping
    public String HelloWorld(){
        return "Friend Controller";
    }
}
