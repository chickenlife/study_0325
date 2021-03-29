package me.jiwoong.study.demo.service;

import lombok.extern.slf4j.Slf4j;
import me.jiwoong.study.demo.dto.UserInfoDTO;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@Slf4j
public class TestDTOService {

    final UserInfoDTO userinfo;

    HashMap<String,Integer> dtomap = new HashMap<>();

    public TestDTOService(UserInfoDTO userinfo) {
        this.userinfo = userinfo;
    }

    //UserInfoDTO userinfo = new UserInfoDTO();

    public void inputUserInfo(String name, int age){
        userinfo.setName(name);
        userinfo.setAge(age);
    }

    public UserInfoDTO outputUserInfo() {
        return userinfo;
    }

    public void inputDTOtoMap() {
        dtomap.put(userinfo.getName(), userinfo.getAge());

        log.debug("dto map is {}",dtomap);
    }
}
