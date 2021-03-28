package me.jiwoong.study.demo.dto;

import lombok.Data;

@Data
public class FirstResponse {
    String firstName;
    String lastName;

    int age;

    public int getAge2() {
        return age + 10;
    }
}
