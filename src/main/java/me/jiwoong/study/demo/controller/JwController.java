package me.jiwoong.study.demo.controller;

import lombok.extern.slf4j.Slf4j;
import me.jiwoong.study.demo.dto.UserInfoDTO;
import me.jiwoong.study.demo.service.TestDTOService;
import me.jiwoong.study.demo.service.UseHashMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class JwController {
    final UseHashMap userService;
    final TestDTOService userinfo;

    public JwController(UseHashMap userService, TestDTOService userinfo) {
        this.userService = userService;
        this.userinfo = userinfo;
    }

    @GetMapping("/selectUsers")
    public String select(){
        return userService.allUser();
    }

    @GetMapping("/selectAges")
    public String selectAge(){
        return userService.allAge();
    }

    @GetMapping("/select2")
    public UserInfoDTO selectUsersDTO()
    {
        return userinfo.outputUserInfo();
    }

    @GetMapping("/insert")
    public void insertUserInfo(String name, int age){
        userinfo.inputUserInfo(name,age);
    }

    @GetMapping("/dtotomap")
    public void insertDTOtoMap() {
        userinfo.inputDTOtoMap();
    }
}
