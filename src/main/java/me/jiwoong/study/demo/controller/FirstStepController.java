package me.jiwoong.study.demo.controller;

import lombok.extern.slf4j.Slf4j;
import me.jiwoong.study.demo.dto.FirstResponse;
import me.jiwoong.study.demo.service.TestService;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
//@RequiredArgsConstructor
public class FirstStepController {

    final TestService testService;
    final me.jiwoong.study.demo.service.UseHashMap useHashMap;

    public FirstStepController(TestService testService, me.jiwoong.study.demo.service.UseHashMap useHashMap) {
        this.testService = testService;
        this.useHashMap = useHashMap;
    }

    @GetMapping("/hi")
    public FirstResponse hi(@RequestParam(value = "name") String name) {
        log.debug("hi : {}", name);
        return testService.hello(name);
    }

    @GetMapping("/hi2")
    public String hi2() {
        log.debug("hi2");
        return "asdf";
    }
/* 03-25 homework. use map.*/
    @GetMapping("/addUserInfo")
    public String addUserInfo(String name, int age){
        return useHashMap.addUserInfo(name, age);
    }
    @GetMapping("/totalAge")
    public String totalAge() {
        return useHashMap.totalAge();
    }
}
