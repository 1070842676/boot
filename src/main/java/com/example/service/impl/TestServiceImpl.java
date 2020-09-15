package com.example.service.impl;

import com.example.entity.Test;
import com.example.entity.User;
import com.example.mapper.TestMapper;
import com.example.mapper.UserMapper;
import com.example.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-09-02
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {
    @Autowired
    private TestMapper testMapper;
    @Autowired
    private UserMapper userMapper;


    @Override
    public boolean addAspect() {
        Test test=new Test();
        test.setAge(new BigDecimal("12"));
        test.setTime(new Date(System.currentTimeMillis()));
        User user=new User();
        user.setAge(1);
        user.setEmail("ceshi");
        user.setName("张三");
        int insert = testMapper.insert(test);
        System.out.println("test success");

        return false;
    }
}
