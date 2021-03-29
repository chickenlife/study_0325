package me.jiwoong.study.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.Map.Entry;

@Service
//@Component
@Slf4j
public class UseHashMapService {
    Map<String,Integer> userInfoMap = new HashMap<>();

    public Map<String, Integer> addUserInfo(String name, int age){
        userInfoMap.put(name,age);
        return userInfoMap;
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
        return "all users : "+users;
    }

    public List<String> allAge(){
        Set<Map.Entry<String, Integer>> entry = userInfoMap.entrySet();
        List<String> ageList = new ArrayList<>();

        for(Entry<String, Integer> entryIter : entry){
            ageList.add(String.valueOf(entryIter.getValue()));
        }
        return ageList;
    }

    public void clear() {
        userInfoMap.clear();
    }
}
