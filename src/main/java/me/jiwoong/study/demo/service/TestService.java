package me.jiwoong.study.demo.service;

import lombok.extern.slf4j.Slf4j;
import me.jiwoong.study.demo.dto.FirstResponse;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
@Component
@Slf4j
public class TestService {

    public FirstResponse hello(String name) {
        FirstResponse response = new FirstResponse();
        response.setFirstName(name);
        response.setLastName("last name");
        response.setAge(10);
        response.getAge2();
        return response;
    }
}
