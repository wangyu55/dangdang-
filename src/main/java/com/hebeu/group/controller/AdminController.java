package com.hebeu.group.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 言立慧
 * @date 2018/12/20 16:59
 * 管理员管理器
 */
@Controller
public class AdminController {
    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "测试";
    }
}
