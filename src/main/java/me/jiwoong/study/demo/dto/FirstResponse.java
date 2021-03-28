package me.jiwoong.study.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.Data;

@Data
public class FirstResponse {
    String firstName;
    String lastName;

    int age;

    @Getter
    @JsonProperty("age2")
    public int getAge2() {
        return age + 10;
    }
}
