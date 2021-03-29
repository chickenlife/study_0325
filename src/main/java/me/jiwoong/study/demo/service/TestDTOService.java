package me.jiwoong.study.demo.service;

import lombok.extern.slf4j.Slf4j;
import me.jiwoong.study.demo.dto.UserInfoDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class TestDTOService {

    final UserInfoDTO userinfo;

    HashMap<String,Integer> dtomap = new HashMap<>();
    HashMap<String, Integer> dtomap2 = new HashMap<>();

    public TestDTOService(@Qualifier("jw") UserInfoDTO userinfo) {
        this.userinfo = userinfo;
    }

    //UserInfoDTO userinfo = new UserInfoDTO();

    public void inputUserInfo(String name, int age, String id, int seq){
        userinfo.setName(name);
        userinfo.setAge(age);
        userinfo.setId(id);
        userinfo.setSeq(seq);
    }

    public UserInfoDTO outputUserInfo() {
        return userinfo;
    }

    public void inputDTOtoMap() {
        dtomap.put(userinfo.getName(), userinfo.getAge());

        log.debug("dto map is {}",dtomap);
    }

    public void getUserInfoList() {
        List<String> aaa = new ArrayList<>();
        aaa.add("1");
        aaa.add("2");

        for (String s : aaa) {
            s = s+"1";
            s = s+"2";
        }

        aaa.forEach(s -> {

        });

        aaa.iterator();

        List<String> streamList = aaa.stream()
                .filter(s -> s.length()>3)
                .map(s -> {
            return s;
        })
                .map(s -> s+"1")
                .map(s -> s+"2")
                .collect(Collectors.toList());
    }
}
