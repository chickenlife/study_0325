package me.jiwoong.study.demo.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class TestDto2Service {
    final UseHashMapService userHashMap;

    public TestDto2Service(UseHashMapService userHashMap) {
        this.userHashMap = userHashMap;
    }

    public void clear() {
        userHashMap.clear();
    }
}
