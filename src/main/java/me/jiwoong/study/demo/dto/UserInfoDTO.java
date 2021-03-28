package me.jiwoong.study.demo.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class UserInfoDTO {
    private String name;
    private int age;
}
