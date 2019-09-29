package com.qianxun.xunwu.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @author 千寻
 * @version 1.0
 * @create 2019-09-28 23:25
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/testMen")
    @ResponseBody
    public String testCon(){

        return new Date().toString();
    }
}
