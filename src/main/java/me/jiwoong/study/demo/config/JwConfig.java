package me.jiwoong.study.demo.config;

import me.jiwoong.study.demo.dto.UserInfoDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestParam;

@Configuration
public class JwConfig {
    @Bean("jw")
    public UserInfoDTO jw() {
        return new UserInfoDTO();
    }

    @Bean
    public UserInfoDTO jw1() {
        return new UserInfoDTO();
    }
}
