package me.jiwoong.study.demo.controller;

import lombok.extern.slf4j.Slf4j;
import me.jiwoong.study.demo.dto.UserInfoDTO;
import me.jiwoong.study.demo.service.TestDTOService;
import me.jiwoong.study.demo.service.UseHashMapService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@Slf4j
public class JwController {
    final UseHashMapService userService;
    final TestDTOService testDTOService;

    public JwController(UseHashMapService userService, TestDTOService testDTOService) {
        this.userService = userService;
        this.testDTOService = testDTOService;
    }

    @GetMapping("/selectUsers")
    public String select(){
        return userService.allUser();
    }

    @GetMapping("/selectAges")
    public List<String> selectAge(){
        return userService.allAge();
    }

    @GetMapping("/select2")
    public UserInfoDTO selectUsersDTO()
    {
        return testDTOService.outputUserInfo();
    }

    @GetMapping("/insert")
    public void insertUserInfo(String name, int age, @RequestParam(name="id", required = false)String id, @RequestParam(name="seq", required = false, defaultValue="0")int seq){
        testDTOService.inputUserInfo(name,age,id,seq);
    }

    @GetMapping("/dtotomap")
    public void insertDTOtoMap() {
        testDTOService.inputDTOtoMap();
    }

    @GetMapping("/selectmap")
    public String selectMap(){
        return userService.allUser();
    }

    @GetMapping("/selectlist-age")
    public List<String> selectAge2() {
        return userService.allAge();
    }
// new homework 2021-03-29
    @GetMapping("/insertmap")
    public Map<String, Integer> insertMap(String name, int age){
        return userService.addUserInfo(name,age);
    }

    @GetMapping("/totalage")
    public String totalAge()
    {
        return userService.totalAge();
    }


}
