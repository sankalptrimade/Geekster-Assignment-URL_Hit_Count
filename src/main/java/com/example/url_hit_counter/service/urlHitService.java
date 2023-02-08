package com.example.url_hit_counter.service;

import com.example.url_hit_counter.model.Visit;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class urlHitService {
    static Map<String, Integer> hmap = new HashMap<>();
    public Visit getVisit(String username) {
        int count = 1;
        if (hmap.containsKey(username)) {
            count = hmap.get(username);
            hmap.put(username, ++count);
        }else{
            hmap.put(username, count);
        }
        Visit visit = new Visit(username, count);
        return visit;
    }

//   static int count = 0;
//   public Visit getVisit(){
//       Visit visit = new Visit(++count);
//       return visit;
//    }
}


