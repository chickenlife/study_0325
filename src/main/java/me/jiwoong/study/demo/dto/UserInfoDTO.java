package me.jiwoong.study.demo.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class UserInfoDTO {
    private String name;
    private int age;

    //add test
    private String id;
    private int seq;
}
