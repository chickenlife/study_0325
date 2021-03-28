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

    public FirstStepController(TestService testService) {
        this.testService = testService;
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
}
