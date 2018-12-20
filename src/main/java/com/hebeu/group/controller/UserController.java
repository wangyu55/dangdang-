package com.hebeu.group.controller;

import com.hebeu.group.pojo.Admin;
import com.hebeu.group.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 言立慧
 * @date 2018/12/20 15:22
 */
@Controller
public class UserController {
    private AdminService adminService;

    @Autowired
    public UserController(AdminService adminService) {
        this.adminService = adminService;
    }

    /**
     * 登录测试
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public Admin login() {
        return adminService.getAdminById(1);
    }
}
