package com.coderwhs.controller;

import com.coderwhs.common.BaseResponse;
import com.coderwhs.common.ResultUtils;
import com.coderwhs.service.ITestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author whs
 * @Date 2024/7/7 18:55
 * @description:
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @Autowired
    private ITestService testService;

    @RequestMapping("/debugSkill")
    public BaseResponse debugSkill(){
        return ResultUtils.success(testService.testDebugSkill());
    }
}
