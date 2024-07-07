package com.coderwhs.service.impl;

import com.coderwhs.service.ITestService;
import org.springframework.stereotype.Service;

/**
 * @Author whs
 * @Date 2024/7/7 18:54
 * @description:
 */
@Service
public class TestServiceImpl implements ITestService {

    private String name;

    @Override
    public String testDebugSkill() {
        System.out.println("-----------------");
        this.name = "张三";
        this.name = "李四";
        this.name = "王五";

        for (int i = 0; i < 50; i++) {
            this.name = "name"+i;
        }

        this.name = "赵六";

        return "ok";
    }

    private int addNum(int num){
        num++;
        return num;
    }
}
