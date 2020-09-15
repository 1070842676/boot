package com.example.service;

import com.example.entity.Test;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2020-09-02
 */
public interface ITestService extends IService<Test> {
    /**
     * 测试全局异常
     * @return
     */
    boolean addAspect();
}
