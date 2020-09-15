package com.example.controller;


import com.example.service.ITestService;
import io.jsonwebtoken.SignatureException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-09-02
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private ITestService testService;

    @RequestMapping("/test")
    public String test(){
        if (1==1){
            throw new SignatureException("测试-----------");
        }
        testService.addAspect();
        return "success";
    }
}
