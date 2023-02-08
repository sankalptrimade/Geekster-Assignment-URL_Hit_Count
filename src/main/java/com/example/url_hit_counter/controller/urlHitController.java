package com.example.url_hit_counter.controller;

import com.example.url_hit_counter.model.Visit;
import com.example.url_hit_counter.service.urlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class urlHitController {
    @Autowired
    private urlHitService urlhitservice;

//    @GetMapping("count")
//    public Visit getHitCount(){
//        return urlhitservice.getVisit();
//    }

    @GetMapping("username/{username}/count")
    public Visit getHitCount(@PathVariable String username){
        return urlhitservice.getVisit(username);
    }
}
