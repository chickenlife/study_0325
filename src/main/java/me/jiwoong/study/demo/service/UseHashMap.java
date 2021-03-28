package me.jiwoong.study.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.Map.Entry;

@Service
//@Component
@Slf4j
public class UseHashMap {
    HashMap<String,Integer> userInfoMap = new HashMap<>();

    public String addUserInfo(String name, int age){
        userInfoMap.put(name,age);
        return "total userinfo is " + userInfoMap;
    }

    public String totalAge(){
        int sumAge = 0;
        int avgAge=0;
        int usersize=0;

        Set<Map.Entry<String, Integer>> users = userInfoMap.entrySet();
        if(users.size() > 0){
            for(Map.Entry<String, Integer> entries : users){
                sumAge += entries.getValue();
            }

            usersize = users.size();
            avgAge = sumAge/usersize;

            log.debug("total count :{}",usersize);
            return "totalAge is "+ sumAge+", average is "+avgAge+", size is "+usersize;
        }else
            return "no information";
    }

    public String allUser(){
        Set users = userInfoMap.keySet();
        return "users : "+users;
    }

    public String allAge(){
        Set<Map.Entry<String, Integer>> entry = userInfoMap.entrySet();
        List<String> ageList = new ArrayList<>();

        for(Entry<String, Integer> entryIter : entry){
            ageList.add(String.valueOf(entryIter.getValue()));
        }
        return "ages : "+ageList;
    }

}
