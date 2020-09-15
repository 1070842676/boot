package com.example.test;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.ITestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.testng.Assert;


import java.util.List;

/**
 * @author wangH
 * @date 2020/9/2 16:51
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {
    @Autowired
    private ITestService testService;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        testService.addAspect();
    }
}
