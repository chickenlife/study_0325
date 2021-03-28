package me.jiwoong.study.demo.service;

import me.jiwoong.study.demo.dto.UserInfoDTO;
import org.springframework.stereotype.Service;

@Service
public class TestDTOService {

    final UserInfoDTO userinfo;

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
}
