package me.jiwoong.study.demo.controller;

import lombok.extern.slf4j.Slf4j;
import me.jiwoong.study.demo.dto.FirstResponse;
import me.jiwoong.study.demo.service.TestService;
import me.jiwoong.study.demo.service.UseHashMapService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@Slf4j
//@RequiredArgsConstructor
public class FirstStepController {

    final TestService testService;
    final UseHashMapService useHashMapService;

    public FirstStepController(TestService testService, UseHashMapService useHashMapService) {
        this.testService = testService;
        this.useHashMapService = useHashMapService;
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
    public Map<String, Integer> addUserInfo(String name, int age){
        return useHashMapService.addUserInfo(name, age);
    }

    @GetMapping("/totalAge")
    public String totalAge() {
        return useHashMapService.totalAge();
    }
}
