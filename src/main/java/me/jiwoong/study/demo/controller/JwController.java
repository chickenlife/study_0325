package me.jiwoong.study.demo.controller;

import me.jiwoong.study.demo.service.UseHashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwController {
    final UseHashMap userService;

    public JwController(UseHashMap userService) {
        this.userService = userService;
    }

    @GetMapping("/selectUsers")
    public String select(){
        return userService.allUser();
    }

    @GetMapping("/selectAges")
    public String selectAge(){
        return userService.allAge();
    }
}
